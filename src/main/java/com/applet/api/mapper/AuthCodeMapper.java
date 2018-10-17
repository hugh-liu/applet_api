package com.applet.api.mapper;

import com.applet.api.entity.AuthCode;
import com.applet.api.entity.AuthCodeExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface AuthCodeMapper {
    int countByExample(AuthCodeExample example);

    int deleteByExample(AuthCodeExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(AuthCode record);

    int insertSelective(AuthCode record);

    List<AuthCode> selectByExample(AuthCodeExample example);

    AuthCode selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") AuthCode record, @Param("example") AuthCodeExample example);

    int updateByExample(@Param("record") AuthCode record, @Param("example") AuthCodeExample example);

    int updateByPrimaryKeySelective(AuthCode record);

    int updateByPrimaryKey(AuthCode record);
}