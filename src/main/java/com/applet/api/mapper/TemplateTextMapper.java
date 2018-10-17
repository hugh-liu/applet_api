package com.applet.api.mapper;

import com.applet.api.entity.TemplateText;
import com.applet.api.entity.TemplateTextExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateTextMapper {
    int countByExample(TemplateTextExample example);

    int deleteByExample(TemplateTextExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplateText record);

    int insertSelective(TemplateText record);

    List<TemplateText> selectByExample(TemplateTextExample example);

    TemplateText selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplateText record, @Param("example") TemplateTextExample example);

    int updateByExample(@Param("record") TemplateText record, @Param("example") TemplateTextExample example);

    int updateByPrimaryKeySelective(TemplateText record);

    int updateByPrimaryKey(TemplateText record);
}