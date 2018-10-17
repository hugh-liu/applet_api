package com.applet.api.entity;

import java.io.Serializable;

public class ViewUserTemplateConfig implements Serializable {
    private Integer id;

    private Integer userId;

    private Integer templateId;

    private String templateTitle;

    private Integer pageId;

    private String pageName;

    private String pageLogo;

    private Integer configId;

    private String dataName;

    private Integer dataType;

    private String dataLogo;

    private Integer configAmount;

    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public Integer getTemplateId() {
        return templateId;
    }

    public void setTemplateId(Integer templateId) {
        this.templateId = templateId;
    }

    public String getTemplateTitle() {
        return templateTitle;
    }

    public void setTemplateTitle(String templateTitle) {
        this.templateTitle = templateTitle;
    }

    public Integer getPageId() {
        return pageId;
    }

    public void setPageId(Integer pageId) {
        this.pageId = pageId;
    }

    public String getPageName() {
        return pageName;
    }

    public void setPageName(String pageName) {
        this.pageName = pageName;
    }

    public String getPageLogo() {
        return pageLogo;
    }

    public void setPageLogo(String pageLogo) {
        this.pageLogo = pageLogo;
    }

    public Integer getConfigId() {
        return configId;
    }

    public void setConfigId(Integer configId) {
        this.configId = configId;
    }

    public String getDataName() {
        return dataName;
    }

    public void setDataName(String dataName) {
        this.dataName = dataName;
    }

    public Integer getDataType() {
        return dataType;
    }

    public void setDataType(Integer dataType) {
        this.dataType = dataType;
    }

    public String getDataLogo() {
        return dataLogo;
    }

    public void setDataLogo(String dataLogo) {
        this.dataLogo = dataLogo;
    }

    public Integer getConfigAmount() {
        return configAmount;
    }

    public void setConfigAmount(Integer configAmount) {
        this.configAmount = configAmount;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}