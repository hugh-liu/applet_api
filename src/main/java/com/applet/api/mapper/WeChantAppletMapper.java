package com.applet.api.mapper;

import com.applet.api.entity.WeChantApplet;
import com.applet.api.entity.WeChantAppletExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface WeChantAppletMapper {
    int countByExample(WeChantAppletExample example);

    int deleteByExample(WeChantAppletExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(WeChantApplet record);

    int insertSelective(WeChantApplet record);

    List<WeChantApplet> selectByExample(WeChantAppletExample example);

    WeChantApplet selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") WeChantApplet record, @Param("example") WeChantAppletExample example);

    int updateByExample(@Param("record") WeChantApplet record, @Param("example") WeChantAppletExample example);

    int updateByPrimaryKeySelective(WeChantApplet record);

    int updateByPrimaryKey(WeChantApplet record);
}