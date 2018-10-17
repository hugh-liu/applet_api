package com.applet.api.mapper;

import com.applet.api.entity.ViewUserTemplateConfig;
import com.applet.api.entity.ViewUserTemplateConfigExample;
import java.util.List;

public interface ViewUserTemplateConfigMapper {
    int countByExample(ViewUserTemplateConfigExample example);

    List<ViewUserTemplateConfig> selectByExample(ViewUserTemplateConfigExample example);
}