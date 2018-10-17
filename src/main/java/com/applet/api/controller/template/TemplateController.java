package com.applet.api.controller.template;

import com.applet.api.core.anno.IgnorePermission;
import com.applet.api.core.anno.SessionScope;
import com.applet.api.entity.*;
import com.applet.api.service.template.TemplateService;
import com.applet.api.util.NullUtil;
import com.applet.api.util.ajax.AjaxResponse;
import com.applet.api.util.page.Page;
import com.applet.api.util.page.PageUtil;
import org.apache.ibatis.annotations.Param;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import javax.servlet.http.HttpServletRequest;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
@RestController
@RequestMapping(value = "/appletApi/template")
public class TemplateController {
    private static final Logger logger = LoggerFactory.getLogger(TemplateController.class);
    @Autowired
    private TemplateService templateService;

    /**
     * 查询页面信息
     * @param applet
     * @param pageLogo
     * @return
     */
    @RequestMapping(value = "/queryPageInfo")
    @IgnorePermission
    public Object queryPageInfo(@SessionScope("appletInfo") ViewAppletInfo applet, @RequestParam("pageLogo") String pageLogo){
        Map<String, Object> map = new HashMap<>();
        List<ViewUserTemplateConfig> configList = templateService.selectUserTemplateConfigList(applet.getUserTemplateId(), pageLogo);
        for (ViewUserTemplateConfig record:configList) {
            if (record.getDataType().intValue() == 2){
                map.put(record.getDataLogo(), templateService.selectTemplateFileList(applet.getUserTemplateId(), record.getConfigId()));
            } else if (record.getDataType().intValue() == 3){
                map.put(record.getDataLogo(), templateService.selectTemplateTextList(applet.getUserTemplateId(), record.getConfigId()));
            }
        }
        return AjaxResponse.success(map);
    }

    /**
     * 分页查询所有商品
     * @param applet
     * @param request
     * @return
     */
    @RequestMapping(value = "/queryGoodsList")
    @IgnorePermission
    public Object queryGoodsList(@SessionScope("appletInfo") ViewAppletInfo applet, HttpServletRequest request){
        try {
            Page page = PageUtil.initPage(request);
            page = templateService.selectGoodsList(applet.getUserTemplateId(), page);
            return AjaxResponse.success(page);
        } catch (Exception e) {
            logger.info("查询热销商品，查询出错{}", e);
        }
        return AjaxResponse.error("加载失败");
    }

    /**
     * 查询热销商品
     * @param applet
     * @param request
     * @return
     */
    @RequestMapping(value = "/querySellGoods")
    @IgnorePermission
    public Object querySellGoods(@SessionScope("appletInfo") ViewAppletInfo applet, HttpServletRequest request){
        try {
            Page page = PageUtil.initPage(request);
            page = templateService.selectGoodsListBySell(applet.getUserTemplateId(), page);
            return AjaxResponse.success(page);
        } catch (Exception e) {
            logger.info("查询热销商品，查询出错{}", e);
        }
        return AjaxResponse.error("加载失败");
    }

    /**
     * 查询商品分类
     * @param applet
     * @return
     */
    @RequestMapping(value = "/queryGoodsType")
    @IgnorePermission
    public Object queryGoodsType(@SessionScope("appletInfo") ViewAppletInfo applet){
        try {
            List<GoodsType> list = templateService.selectGoodsTypeList(applet.getUserTemplateId());
            if (NullUtil.isNotNullOrEmpty(list)){
                return AjaxResponse.success(list);
            }
            return AjaxResponse.error("未找到相关记录");
        } catch (Exception e) {
            logger.error("查询商品分类，查询出错{}", e);
        }
        return AjaxResponse.error("加载失败");
    }

    /**
     * 分页查询分类商品列表
     * @param applet
     * @return
     */
    @RequestMapping(value = "/queryGoodsListByType")
    @IgnorePermission
    public Object queryGoodsListByType(@SessionScope("appletInfo") ViewAppletInfo applet){
        try {
            List<ViewGoodsType> list = templateService.selectGoodsList(applet.getUserTemplateId());
            if (NullUtil.isNotNullOrEmpty(list)){
                return AjaxResponse.success(list);
            }
            return AjaxResponse.error("未找到相关记录");
        } catch (Exception e) {
            logger.info("分页查询分类商品列表，查询出错{}", e);
        }
        return AjaxResponse.error("加载失败");
    }

    /**
     * 查看商品详情
     * @param applet
     * @param id
     * @return
     */
    @RequestMapping(value = "/queryGoodsDetalis")
    @IgnorePermission
    public Object queryGoodsDetalis(@SessionScope("appletInfo") ViewAppletInfo applet, @RequestParam Integer id){
        Map map = new HashMap();
        GoodsInfo goodsInfo = templateService.selectGoodsInfo(applet.getUserTemplateId(), id);
        map.put("goodsInfo", goodsInfo);
        return AjaxResponse.success(map);
    }
}
