package com.applet.api.controller;

import com.applet.api.entity.FigureCode;
import com.applet.api.entity.WeChantApplet;
import com.applet.api.service.other.FigureCodeService;
import com.applet.api.service.weChant.WeChantService;
import com.applet.api.util.ImgUtil;
import com.applet.api.util.ajax.AjaxResponse;
import com.applet.api.util.constant.Constants;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.imageio.ImageIO;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.awt.image.BufferedImage;

/**
 * @author zhouhuahu
 * @date 2018/9/17
 */
@Controller
@RequestMapping
public class OtherController {
    private static final Logger log = LoggerFactory.getLogger(OtherController.class);
    @Autowired
    private WeChantService weChantService;
    @Autowired
    private FigureCodeService figureCodeService;

    /**
     * 获取图形验证码图片
     * @param request
     * @param response
     */
    @RequestMapping(value = "/code/loadFigureCode")
    public void loadFigureCode(@RequestParam("wxLogo") String wxLogo, HttpServletRequest request, HttpServletResponse response){
        try {
            WeChantApplet weChantApplet = weChantService.selectWeChantApplet(wxLogo);
            figureCodeService.deleteFigureCode(weChantApplet.getId(), Constants.BIND_MOBILE_FIGURE_CODE);
            ImgUtil imgUtil = new ImgUtil();
            figureCodeService.saveFigureCode(weChantApplet.getId(), imgUtil.getCode(), Constants.BIND_MOBILE_FIGURE_CODE);
            BufferedImage image = imgUtil.getBuffImg();
            request.getSession().setAttribute(wxLogo, imgUtil.getCode());
            ImageIO.write(image, "JPEG", response.getOutputStream());
        } catch (Exception e) {
            log.info("图形验证码生成失败{}", e);
        }
    }

    /**
     * 获取图形验证码
     * @param wxLogo
     * @return
     */
    @RequestMapping(value = "/code/getFigureCode")
    @ResponseBody
    public Object getFigureCode(@RequestParam("wxLogo") String wxLogo){
        try {
            WeChantApplet weChantApplet = weChantService.selectWeChantApplet(wxLogo);
            FigureCode figureCode = figureCodeService.selectFigureCode(weChantApplet.getId(), Constants.BIND_MOBILE_FIGURE_CODE);
            if (figureCode != null){
                return AjaxResponse.success(figureCode.getCode());
            }
        } catch (Exception e) {
            log.error("加载验证码出错{}", e);
        }
        return AjaxResponse.error("加载验证码失败");
    }
}
