package com.applet.api.mapper;

import com.applet.api.entity.ViewTemplatePageConfigList;
import com.applet.api.entity.ViewTemplatePageConfigListExample;
import java.util.List;

public interface ViewTemplatePageConfigListMapper {
    int countByExample(ViewTemplatePageConfigListExample example);

    List<ViewTemplatePageConfigList> selectByExample(ViewTemplatePageConfigListExample example);
}