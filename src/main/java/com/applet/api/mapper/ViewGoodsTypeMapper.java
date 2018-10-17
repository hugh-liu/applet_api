package com.applet.api.mapper;

import com.applet.api.entity.ViewGoodsType;
import com.applet.api.entity.ViewGoodsTypeExample;
import java.util.List;

public interface ViewGoodsTypeMapper {
    int countByExample(ViewGoodsTypeExample example);

    List<ViewGoodsType> selectByExample(ViewGoodsTypeExample example);
}