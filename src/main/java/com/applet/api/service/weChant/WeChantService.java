package com.applet.api.service.weChant;

import com.applet.api.core.security.DesUtil;
import com.applet.api.core.security.MD5Util;
import com.applet.api.entity.*;
import com.applet.api.mapper.*;
import com.applet.api.util.NullUtil;
import com.applet.api.util.RandomUtil;
import com.applet.api.util.aliyun.SmsUtil;
import jodd.datetime.JDateTime;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;
import java.util.List;

/**
 * Created by zhouhuahu on 2018/6/26.
 */
@Service
public class WeChantService {
    @Autowired
    private WeChantInfoMapper weChantInfoMapper;
    @Autowired
    private UserInfoMapper userInfoMapper;
    @Autowired
    private CommonMapper commonMapper;

    /**
     * 查询登录微信信息
     * @param appletId
     * @param openId
     * @param nickName
     * @return
     */
    public WeChantInfo selectWeChantInfo(Integer appletId, String openId, String nickName){
        WeChantInfoExample example = new WeChantInfoExample();
        example.createCriteria().andOpenIdEqualTo(openId).andAppletIdEqualTo(appletId);
        List<WeChantInfo> list = weChantInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            WeChantInfo info = list.get(0);
            if (info.getStatus()){
                return info;
            }
            return null;
        } else {
            WeChantInfo info = new WeChantInfo();
            info.setAppletId(appletId);
            info.setOpenId(openId);
            String cipher = DesUtil.encrypt(openId, RandomUtil.getUUID());
            cipher = MD5Util.MD5(cipher);
            info.setWxLogo(cipher);
            info.setNickName(nickName);
            info.setCreateTime(new Date());
            info.setStatus(true);
            weChantInfoMapper.insertSelective(info);
            return info;
        }
    }

    /**
     * 查询微信信息
     * @param wxLogo
     * @return
     */
    public WeChantInfo selectWeChantInfo(String wxLogo){
        WeChantInfoExample example = new WeChantInfoExample();
        example.createCriteria().andWxLogoEqualTo(wxLogo);
        List<WeChantInfo> list = weChantInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            WeChantInfo info = list.get(0);
            if (info.getStatus()){
                return info;
            }
        }
        return null;
    }

    /**
     * 查询微信信息
     * @param appletId
     * @param wxLogo
     * @return
     */
    public WeChantInfo selectWeChantInfo(Integer appletId, String wxLogo){
        WeChantInfoExample example = new WeChantInfoExample();
        example.createCriteria().andAppletIdEqualTo(appletId).andWxLogoEqualTo(wxLogo);
        List<WeChantInfo> list = weChantInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            WeChantInfo info = list.get(0);
            if (info.getStatus()){
                return info;
            }
        }
        return null;
    }

    /**
     * 修改微信昵称
     * @param id
     * @param nickName
     */
    public void updateNickName(Integer id, String nickName){
        WeChantInfo record = new WeChantInfo();
        record.setId(id);
        record.setNickName(nickName);
        weChantInfoMapper.updateByPrimaryKeySelective(record);
    }

    /**
     * 查询用户信息
     * @param userId
     * @return
     */
    public UserInfo getUserInfo(Integer userId){
        return userInfoMapper.selectByPrimaryKey(userId);
    }

    /**
     * 查询用户信息
     * @param mobile
     * @return
     */
    public UserInfo getUserInfo(String mobile){
        UserInfoExample example = new UserInfoExample();
        example.createCriteria().andMobileEqualTo(mobile);
        List<UserInfo> list = userInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            return list.get(0);
        }
        return null;
    }

    /**
     * 更新微信绑定用户
     * @param weChantInfo
     * @param mobile
     * @param code
     * @return
     */
    @Transactional(rollbackFor = Exception.class)
    public void updateWeChant(WeChantInfo weChantInfo, String mobile, String code){
        UserInfo info = getUserInfo(mobile);
        if (info == null){
            //未注册手机号则自动完成注册
            info = new UserInfo();
            info.setMobile(mobile);
            info.setNickName(weChantInfo.getNickName());
            info.setEncrypted(RandomUtil.getRandomStr32());
            String cipher = DesUtil.encrypt(code, info.getEncrypted());
            cipher = MD5Util.MD5(cipher);
            info.setPassword(cipher);
            info.setIsDealer(false);
            info.setBalance(0.0d);
            info.setFreeBalance(0.0d);
            info.setIntegral(0);
            info.setCreateDate(new Date());
            info.setStatus(true);
            userInfoMapper.insertSelective(info);
        }
        if (info.getStatus()){
            weChantInfo.setUserId(info.getId());
            weChantInfoMapper.updateByPrimaryKeySelective(weChantInfo);
        }
    }

    /**
     * 微信自动解绑账号
     * @param weChantInfo
     */
    public void updateWeChant(WeChantInfo weChantInfo){
        String sql = "UPDATE bus_we_chant SET user_id = NULL WHERE id = " + weChantInfo.getId();
        commonMapper.updateBatch(sql);
    }
}
