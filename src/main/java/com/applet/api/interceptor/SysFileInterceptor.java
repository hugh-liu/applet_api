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
 * @author zhouhuahu
 * @date 2018/10/9
 */
public class SysFileInterceptor extends HandlerInterceptorAdapter {
    private static final Logger log = LoggerFactory.getLogger(SysFileInterceptor.class);

    @Override
    public boolean preHandle(HttpServletRequest request, HttpServletResponse response, Object handler) throws Exception {
        String requestUri = request.getRequestURI();
        requestUri = requestUri.replaceAll("/api","");
        log.info("获取template文件路径{}", requestUri);
        if (NullUtil.isNotNullOrEmpty(requestUri) && QiniuUtil.existsFile(Config.bucketTemplateFile, requestUri)){
            String url = QiniuUtil.generateQiniuTemplateDownURL(requestUri) + "&appletToken=" + RandomUtil.getRandomStr32();
            response.sendRedirect(url);
            log.info("七牛云文件路径：" + url);
            return false;
        }
        return true;
    }
}
