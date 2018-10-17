package com.applet.api.mapper;

import com.applet.api.entity.UserTemplate;
import com.applet.api.entity.UserTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UserTemplateMapper {
    int countByExample(UserTemplateExample example);

    int deleteByExample(UserTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(UserTemplate record);

    int insertSelective(UserTemplate record);

    List<UserTemplate> selectByExample(UserTemplateExample example);

    UserTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") UserTemplate record, @Param("example") UserTemplateExample example);

    int updateByExample(@Param("record") UserTemplate record, @Param("example") UserTemplateExample example);

    int updateByPrimaryKeySelective(UserTemplate record);

    int updateByPrimaryKey(UserTemplate record);
}