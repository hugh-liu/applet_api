package com.applet.api.interceptor;

import com.applet.api.util.NullUtil;
import com.applet.api.util.RandomUtil;
import com.applet.api.util.qiniu.Config;
import com.applet.api.util.qiniu.QiniuUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.servlet.handler.HandlerInterceptorAdapter;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Created by zhouhuahu on 2018/6/13.
 */
public class ImgInterceptor extends HandlerInterceptorAdapter {
    private static final Logger log = LoggerFactory.getLogger(ImgInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();
        log.info("小程序获取图片路径{}", requestUri);
        requestUri = requestUri.replaceAll("/api","");
        if (NullUtil.isNotNullOrEmpty(requestUri) && QiniuUtil.existsFile(Config.bucketAppletPrivate, requestUri)){
            String url = QiniuUtil.generateQiniuPrivateDownURL(requestUri) + "&apiToken=" + RandomUtil.getRandomStr32();
            response.sendRedirect(url);
            log.info("七牛云图片路径{}", url);
            return false;
        }
        return true;
    }
}
