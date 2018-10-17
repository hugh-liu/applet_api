package com.applet.api.service.applet;

import com.applet.api.entity.*;
import com.applet.api.mapper.AppletInfoMapper;
import com.applet.api.mapper.UserTemplateMapper;
import com.applet.api.mapper.ViewAppletInfoMapper;
import com.applet.api.util.NullUtil;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

/**
 * Created by zhouhuahu on 2018/6/27.
 */
@Service
public class AppletService {
    private static final Logger log = LoggerFactory.getLogger(AppletService.class);
    @Autowired
    private AppletInfoMapper appletInfoMapper;
    @Autowired
    private UserTemplateMapper userTemplateMapper;
    @Autowired
    private ViewAppletInfoMapper viewAppletInfoMapper;

    /**
     * 查询小程序信息
     * @param id
     * @return
     */
    public AppletInfo selectAppletInfo(Integer id) {
        return appletInfoMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询用户模板信息
     * @param id
     * @return
     */
    public UserTemplate selectUserTemplateInfo(Integer id){
        return userTemplateMapper.selectByPrimaryKey(id);
    }

    /**
     * 查询登录小程序信息
     * @param appletCode
     * @return
     */
    public ViewAppletInfo selectAppletInfo(String appletCode){
        ViewAppletInfoExample example = new ViewAppletInfoExample();
        example.createCriteria().andAppletCodeEqualTo(appletCode);
       List<ViewAppletInfo> list = viewAppletInfoMapper.selectByExample(example);
       if (NullUtil.isNotNullOrEmpty(list)){
           return list.get(0);
       }
       return null;
    }

    /**
     * 更新小程序位置信息
     * @param appletId
     * @param map
     */
    public void updateAppletAddress(Integer appletId, Map map){
        AppletInfo applet = selectAppletInfo(appletId);
        applet.setProvince(map.get("province").toString());
        applet.setCity(map.get("city").toString());
        applet.setCounty(map.get("district").toString());
        applet.setAddress(map.get("address").toString());
        applet.setAddressTitle(map.get("title").toString());
        applet.setLon(map.get("lon").toString());
        applet.setLat(map.get("lat").toString());
        appletInfoMapper.updateByPrimaryKeySelective(applet);
    }
}
