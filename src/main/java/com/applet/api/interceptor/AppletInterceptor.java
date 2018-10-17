package com.applet.api.interceptor;

import com.applet.api.core.anno.IgnorePermission;
import com.applet.api.entity.ViewAppletInfo;
import com.applet.api.entity.WeChantInfo;
import com.applet.api.service.applet.AppletService;
import com.applet.api.service.weChant.WeChantService;
import com.applet.api.util.NullUtil;
import com.applet.api.util.ajax.AjaxResponse;
import com.google.gson.Gson;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.method.HandlerMethod;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
public class AppletInterceptor extends HandlerInterceptorAdapter {
    private static final Logger logger = LoggerFactory.getLogger(AppletInterceptor.class);
    @Autowired
    private WeChantService weChantService;
    @Autowired
    private AppletService appletService;

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        try {
            logger.info("初始化访问者信息...");
            String appletCode = request.getParameter("appletCode").toString();
            if (NullUtil.isNullOrEmpty(appletCode)){
                return false;
            }
            //检查小程序及当前应用模板状态
            ViewAppletInfo appletInfo = appletService.selectAppletInfo(appletCode);
            if (appletInfo == null){
                sendPrompt(response, "亲,小程序还未配置模板哦");
                return false;
            }
            if (!appletInfo.getAppletStatus()){
                sendPrompt(response, "亲,小程序还未开通哦!");
                return false;
            }
            if (appletInfo.getTemplateStatus() != 1){
                sendPrompt(response, "亲,小程序模板已过期哦!");
                return false;
            }
            if (!appletInfo.getIfSelling()){
                sendPrompt(response, "亲,小程序还未启用哦，敬请期待!");
                return false;
            }
            request.getSession().setAttribute("appletInfo", appletInfo);

            //取消用户登录认证
            HandlerMethod handleMethod = (HandlerMethod) handler;
            IgnorePermission per  = handleMethod.getMethodAnnotation(IgnorePermission.class);
            if (per != null){
                return true;
            }

            //检查登录用户信息
            String wxLogo = request.getParameter("wxLogo").toString();
            if (NullUtil.isNullOrEmpty(wxLogo)){
                sendPrompt(response, "亲,登录过期啦");
                return false;
            }
            WeChantInfo weChantInfo = weChantService.selectWeChantInfo(appletInfo.getId(), wxLogo);
            if (weChantInfo == null || !weChantInfo.getStatus()){
                sendPrompt(response, "亲,账号还未开通哦!");
                return false;
            }
            request.getSession().setAttribute("weChantInfo", weChantInfo);
            return true;
        } catch (Exception e) {
            logger.error("访问出错{}", e);
            return false;
        }
    }

    @Override
    public void afterCompletion(HttpServletRequest request, HttpServletResponse response, Object handler, Exception ex) throws Exception {
        logger.info("清除访问者信息...");
        request.getSession().removeAttribute("appletInfo");
        request.getSession().removeAttribute("weChantInfo");
    }

    /**
     * 发送提示
     * @param response
     * @param msg
     */
    private void sendPrompt(HttpServletResponse response, String msg){
        try {
            response.setHeader("Content-type", "application/json;charset=UTF-8");
            String returnMsg = new Gson().toJson(AjaxResponse.error(msg));
            response.getWriter().write(returnMsg);
            response.setHeader("sessionstatus", "timeout");// 在响应头设置session状态
        } catch (Exception e) {
            logger.error("发送提示出错");
        }
    }
}
