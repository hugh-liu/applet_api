package com.applet.api.entity;

import java.io.Serializable;
import java.util.Date;

public class TemplateText implements Serializable {
    private Integer id;

    private Integer userTemplateId;

    private Integer configId;

    private Integer textType;

    private String textContent;

    private Integer textIndex;

    private Date createTime;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserTemplateId() {
        return userTemplateId;
    }

    public void setUserTemplateId(Integer userTemplateId) {
        this.userTemplateId = userTemplateId;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }

    public Integer getTextIndex() {
        return textIndex;
    }

    public void setTextIndex(Integer textIndex) {
        this.textIndex = textIndex;
    }

    public Date getCreateTime() {
        return createTime;
    }

    public void setCreateTime(Date createTime) {
        this.createTime = createTime;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}