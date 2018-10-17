package com.applet.api.mapper;

import com.applet.api.entity.ViewAppletInfo;
import com.applet.api.entity.ViewAppletInfoExample;
import java.util.List;

public interface ViewAppletInfoMapper {
    int countByExample(ViewAppletInfoExample example);

    List<ViewAppletInfo> selectByExample(ViewAppletInfoExample example);
}