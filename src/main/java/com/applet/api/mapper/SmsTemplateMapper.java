package com.applet.api.mapper;

import com.applet.api.entity.SmsTemplate;
import com.applet.api.entity.SmsTemplateExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface SmsTemplateMapper {
    int countByExample(SmsTemplateExample example);

    int deleteByExample(SmsTemplateExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(SmsTemplate record);

    int insertSelective(SmsTemplate record);

    List<SmsTemplate> selectByExample(SmsTemplateExample example);

    SmsTemplate selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByExample(@Param("record") SmsTemplate record, @Param("example") SmsTemplateExample example);

    int updateByPrimaryKeySelective(SmsTemplate record);

    int updateByPrimaryKey(SmsTemplate record);
}