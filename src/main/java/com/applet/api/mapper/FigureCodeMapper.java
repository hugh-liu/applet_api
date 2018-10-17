package com.applet.api.mapper;

import com.applet.api.entity.FigureCode;
import com.applet.api.entity.FigureCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface FigureCodeMapper {
    int countByExample(FigureCodeExample example);

    int deleteByExample(FigureCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(FigureCode record);

    int insertSelective(FigureCode record);

    List<FigureCode> selectByExample(FigureCodeExample example);

    FigureCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") FigureCode record, @Param("example") FigureCodeExample example);

    int updateByExample(@Param("record") FigureCode record, @Param("example") FigureCodeExample example);

    int updateByPrimaryKeySelective(FigureCode record);

    int updateByPrimaryKey(FigureCode record);
}