package com.applet.api.mapper;

import com.applet.api.entity.TemplateFile;
import com.applet.api.entity.TemplateFileExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface TemplateFileMapper {
    int countByExample(TemplateFileExample example);

    int deleteByExample(TemplateFileExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(TemplateFile record);

    int insertSelective(TemplateFile record);

    List<TemplateFile> selectByExample(TemplateFileExample example);

    TemplateFile selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") TemplateFile record, @Param("example") TemplateFileExample example);

    int updateByExample(@Param("record") TemplateFile record, @Param("example") TemplateFileExample example);

    int updateByPrimaryKeySelective(TemplateFile record);

    int updateByPrimaryKey(TemplateFile record);
}