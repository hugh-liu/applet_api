package com.applet.api.controller.weChant;

import com.applet.api.config.WechatAppletConfig;
import com.applet.api.core.anno.IgnorePermission;
import com.applet.api.core.anno.SessionScope;
import com.applet.api.entity.*;
import com.applet.api.service.other.AuthCodeService;
import com.applet.api.service.other.FigureCodeService;
import com.applet.api.service.weChant.WeChantService;
import com.applet.api.util.IpUtil;
import com.applet.api.util.NullUtil;
import com.applet.api.util.RandomUtil;
import com.applet.api.util.RegularUtil;
import com.applet.api.util.ajax.AjaxResponse;
import com.applet.api.util.aliyun.SmsUtil;
import com.applet.api.util.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
@RestController
@RequestMapping(value = "/appletApi")
public class WeChantController {
    private static final Logger logger = LoggerFactory.getLogger(WeChantController.class);
    @Autowired
    private WeChantService weChantService;
    @Autowired
    private FigureCodeService figureCodeService;
    @Autowired
    private AuthCodeService authCodeService;

    /**
     * 授权登录
     * @param code
     * @return
     */
    @RequestMapping(value = "/login")
    @IgnorePermission
    public Object login(@SessionScope("appletInfo") ViewAppletInfo appletInfo, @RequestParam("code") String code, @RequestParam("nickName") String nickName){
        try {
            String openId = WechatAppletConfig.getOpenId(code, appletInfo.getAppId(), appletInfo.getAppSecret());
            WeChantInfo info = weChantService.selectWeChantInfo(appletInfo.getId(), openId, nickName);
            if (info != null){
                if (NullUtil.isNullOrEmpty(info.getNickName()) || !nickName.equals(info.getNickName())){
                    weChantService.updateNickName(info.getId(), nickName);
                }
                Map<String, Object> map = new HashMap<>();
                map.put("wxLogo", info.getWxLogo());
                map.put("isDealer", false);
                if (NullUtil.isNotNullOrEmpty(info.getUserId())){
                    if (appletInfo.getUserId().intValue() == info.getUserId().intValue()){
                        map.put("isDealer", true);
                    }
                    UserInfo user = weChantService.getUserInfo(info.getUserId());
                    if (user != null){
                        if (user.getStatus()){
                            map.put("userInfo", user.getUserInfo());
                        } else {
                            //自动解绑封禁账号
                            weChantService.updateWeChant(info);
                        }
                    }
                }
                return AjaxResponse.success(map);
            }
        } catch (Exception e) {
            logger.info("授权登录出错{}", e);
        }
        return AjaxResponse.error("授权登录失败");
    }


    /**
     * 加载个人中心
     * @param appletInfo
     * @param info
     * @return
     */
    @RequestMapping(value = "/loadPersonalCenter")
    public Object loadPersonalCenter(@SessionScope("appletInfo") ViewAppletInfo appletInfo, @SessionScope("weChantInfo") WeChantInfo info){
        Map<String, Object> map = new HashMap<>();
        map.put("mobile", null);//当前绑定账号
        if (!NullUtil.isNotNullOrEmpty(info.getUserId())){
            UserInfo userInfo = weChantService.getUserInfo(info.getUserId());
            if (userInfo != null){
                map.put("mobile", userInfo.getMobile());
            }
        }
        return AjaxResponse.success(map);
    }

    /**
     * 发送绑定/解绑微信验证码
     * @param weChantInfo
     * @param newMobile
     * @param request
     * @return
     */
    @RequestMapping(value = "/sendBindWxCode")
    public Object sendBindWxCode(@SessionScope("weChantInfo") WeChantInfo weChantInfo, @RequestParam("newMobile") String newMobile,
                                 @RequestParam("fCode") String fCode, HttpServletRequest request){
        if (NullUtil.isNullOrEmpty(newMobile)){
            return AjaxResponse.error("账号不能为空");
        }
        if (!RegularUtil.checkMobile(newMobile)){
            return AjaxResponse.error("账号格式不正确");
        }
        FigureCode figureCode = figureCodeService.selectFigureCode(weChantInfo.getId(), Constants.BIND_MOBILE_FIGURE_CODE);
        if (figureCode == null){
            return AjaxResponse.error("图形码错误");
        }
        if (!figureCode.getCode().toLowerCase().equals(fCode)){
            return AjaxResponse.error("图形码输入错误");
        }
        UserInfo newInfo = weChantService.getUserInfo(newMobile);
        if (newInfo != null && !newInfo.getStatus()){
            return AjaxResponse.error("账号已禁用");
        } else {
            newInfo = new UserInfo();
            newInfo.setMobile(newMobile);
        }
        String ip = IpUtil.getIpAddr(request);
        String smsCode = RandomUtil.getRandomStr(6);
        String operation = "";
        String mobile = "";
        if (NullUtil.isNotNullOrEmpty(weChantInfo.getUserId())){
            //修改绑定账号时验证码默认发送给绑定账号
            UserInfo oldInfo = weChantService.getUserInfo(weChantInfo.getUserId());
            if (oldInfo == null){
                return AjaxResponse.error("Error: user is null");
            }
            if (newMobile.equals(oldInfo.getMobile())){
                return AjaxResponse.error("手机号码一致！");
            }
            int num = authCodeService.getTodaySendCodeCount(oldInfo.getMobile(), Constants.BIND_MOBILE_TO_UPDATE);
            if (num >= Constants.SMS_CODE_AMOUNT.intValue()){
                return AjaxResponse.error("今日短信发送次数已达上限，请明日再试");
            }
            authCodeService.addAuthCode(oldInfo.getId(), oldInfo.getMobile(), Constants.BIND_MOBILE_TO_UPDATE, smsCode, ip);
            operation = "修改绑定";
            mobile = oldInfo.getMobile();
        } else {
            int num = authCodeService.getTodaySendCodeCount(newInfo.getMobile(), Constants.BIND_MOBILE_TO_ADD);
            if (num >= Constants.SMS_CODE_AMOUNT.intValue()){
                return AjaxResponse.error("今日短信发送次数已达上限，请明日再试");
            }
            authCodeService.addAuthCode(newInfo.getId(), newInfo.getMobile(), Constants.BIND_MOBILE_TO_ADD, smsCode, ip);
            operation = "绑定";
            mobile = newInfo.getMobile();
        }
        SmsTemplate template = authCodeService.selectSmsTemplateByType(Constants.BIND_MOBILE_OPERATION);
        return sendBindWxCode(template, mobile, operation, smsCode);
    }

    /**
     * 发送绑定微信验证码
     * @param template
     * @param mobile
     * @param operate
     * @param code
     * @return
     */
    private Object sendBindWxCode(SmsTemplate template, String mobile, String operate, String code){
        try {
            String param = "{\"userName\":\"" + mobile + "\",\"operate\":\"" + operate + "\",\"code\":\"" + code + "\"}";
            SmsUtil.sendSms(mobile, template.getSingName(), template.getCode(), param);
            return AjaxResponse.success("发送成功，验证码10分钟内有效");
        } catch (Exception e) {
            logger.error("发送验证码出错");
        }
        return AjaxResponse.error("发送失败");
    }

    /**
     * 绑定账号
     * @param weChantInfo
     * @param mobile
     * @param code
     * @return
     */
    @RequestMapping(value = "/bindingAccount")
    public Object bindingAccount(@SessionScope("weChantInfo") WeChantInfo weChantInfo,
                                 @RequestParam("mobile") String mobile, @RequestParam("code") String code){
        try {
            AuthCode authCode = null;
            if (NullUtil.isNotNullOrEmpty(weChantInfo.getUserId())){
                UserInfo userInfo = weChantService.getUserInfo(weChantInfo.getUserId());
                authCode = authCodeService.selectAuthCodeByMobile(userInfo.getMobile());
            } else {
                authCode = authCodeService.selectAuthCodeByMobile(mobile);
            }
            if (authCode == null){
                return AjaxResponse.error("验证码已过期");
            }
            if (!code.equals(authCode.getAuthCode())){
                return AjaxResponse.error("验证码错误");
            }
            weChantService.updateWeChant(weChantInfo, mobile, code);
            return AjaxResponse.success("绑定成功");
        } catch (Exception e) {
            logger.error("微信绑定账号出错{}", e);
        }
        return AjaxResponse.error("绑定失败");
    }

}
