package com.applet.api.service.template;

import com.applet.api.entity.*;
import com.applet.api.mapper.*;
import com.applet.api.util.NullUtil;
import com.applet.api.util.page.Page;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
@Service
public class TemplateService {
    private static final Logger logger = LoggerFactory.getLogger(TemplateService.class);
    @Autowired
    private TemplatePageMapper templatePageMapper;
    @Autowired
    private TemplateTextMapper templateTextMapper;
    @Autowired
    private TemplateFileMapper templateFileMapper;
    @Autowired
    private GoodsInfoMapper goodsInfoMapper;
    @Autowired
    private GoodsTypeMapper goodsTypeMapper;
    @Autowired
    private ViewUserTemplateConfigMapper viewUserTemplateConfigMapper;
    @Autowired
    private ViewGoodsTypeMapper viewGoodsTypeMapper;

    /**
     * 查询页面配置信息
     * @param userTemplateId
     * @param pageLogo
     * @return
     */
    public List<ViewUserTemplateConfig> selectUserTemplateConfigList(Integer userTemplateId, String pageLogo){
        ViewUserTemplateConfigExample example = new ViewUserTemplateConfigExample();
        example.createCriteria().andIdEqualTo(userTemplateId).andPageLogoEqualTo(pageLogo);
        return viewUserTemplateConfigMapper.selectByExample(example);
    }

    /**
     * 查询文本内容
     * @param userTemplateId
     * @param configId
     * @return
     */
    public List<TemplateText> selectTemplateTextList(Integer userTemplateId, Integer configId){
        TemplateTextExample example = new TemplateTextExample();
        example.setOrderByClause("text_index asc");
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andConfigIdEqualTo(configId).andStatusEqualTo(true);
        return templateTextMapper.selectByExample(example);
    }

    /**
     * 查询资源内容
     * @param userTemplateId
     * @param configId
     * @return
     */
    public List<TemplateFile> selectTemplateFileList(Integer userTemplateId, Integer configId){
        TemplateFileExample example = new TemplateFileExample();
        example.setOrderByClause("file_index asc");
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andConfigIdEqualTo(configId).andStatusEqualTo(true);
        return templateFileMapper.selectByExample(example);
    }

    /**
     * 查询店铺商品分类
     * @param userTemplateId
     * @return
     */
    public List<GoodsType> selectGoodsTypeList(Integer userTemplateId){
        GoodsTypeExample example = new GoodsTypeExample();
        example.setOrderByClause("type_index asc");
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andStatusEqualTo(true);
        return goodsTypeMapper.selectByExample(example);
    }

    /**
     * 分页查询所有商品
     * @param userTemplateId
     * @param page
     * @return
     */
    public Page selectGoodsList(Integer userTemplateId, Page page){
        GoodsInfoExample example = new GoodsInfoExample();
        example.setPage(page);
        example.setOrderByClause("goods_index asc");
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andStatusEqualTo(true);
        int count = goodsInfoMapper.countByExample(example);
        if (count > 0){
            page.setTotal(count);
            page.setData(goodsInfoMapper.selectByExample(example));
        }
        return page;
    }

    /**
     * 查询店铺模板热销商品
     * @param userTemplateId
     * @param page
     * @return
     */
    public Page selectGoodsListBySell(Integer userTemplateId, Page page){
        GoodsInfoExample example = new GoodsInfoExample();
        example.setPage(page);
        example.setOrderByClause("goods_index asc");
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andIfSellEqualTo(true).andStatusEqualTo(true);
        int count = goodsInfoMapper.countByExample(example);
        if (count > 0){
            page.setTotal(count);
            page.setData(goodsInfoMapper.selectByExample(example));
        }
        return page;
    }

    /**
     * 分类查询商品列表信息
     * @param userTemplateId
     * @return
     */
    public List<ViewGoodsType> selectGoodsList(Integer userTemplateId){
        ViewGoodsTypeExample example = new ViewGoodsTypeExample();
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId);
        return viewGoodsTypeMapper.selectByExample(example);
    }

    /**
     * 查询商品信息
     * @param userTemplateId
     * @param id
     * @return
     */
    public GoodsInfo selectGoodsInfo(Integer userTemplateId, Integer id){
        GoodsInfoExample example = new GoodsInfoExample();
        example.createCriteria().andUserTemplateIdEqualTo(userTemplateId).andIdEqualTo(id).andStatusEqualTo(true);
        List<GoodsInfo> list = goodsInfoMapper.selectByExample(example);
        if (NullUtil.isNotNullOrEmpty(list)){
            return list.get(0);
        }
        return null;
    }

}
