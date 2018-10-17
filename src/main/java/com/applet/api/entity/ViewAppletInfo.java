package com.applet.api.entity;

import java.io.Serializable;

public class ViewAppletInfo implements Serializable {
    private Integer id;

    private String appletName;

    private String imgUrl;

    private Integer userId;

    private String appletCode;

    private String appId;

    private String appSecret;

    private Boolean ifSelling;

    private Boolean appletStatus;

    private Integer userTemplateId;

    private Integer templateStatus;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getAppletName() {
        return appletName;
    }

    public void setAppletName(String appletName) {
        this.appletName = appletName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getUserId() {
        return userId;
    }

    public void setUserId(Integer userId) {
        this.userId = userId;
    }

    public String getAppletCode() {
        return appletCode;
    }

    public void setAppletCode(String appletCode) {
        this.appletCode = appletCode;
    }

    public String getAppId() {
        return appId;
    }

    public void setAppId(String appId) {
        this.appId = appId;
    }

    public String getAppSecret() {
        return appSecret;
    }

    public void setAppSecret(String appSecret) {
        this.appSecret = appSecret;
    }

    public Boolean getIfSelling() {
        return ifSelling;
    }

    public void setIfSelling(Boolean ifSelling) {
        this.ifSelling = ifSelling;
    }

    public Boolean getAppletStatus() {
        return appletStatus;
    }

    public void setAppletStatus(Boolean appletStatus) {
        this.appletStatus = appletStatus;
    }

    public Integer getUserTemplateId() {
        return userTemplateId;
    }

    public void setUserTemplateId(Integer userTemplateId) {
        this.userTemplateId = userTemplateId;
    }

    public Integer getTemplateStatus() {
        return templateStatus;
    }

    public void setTemplateStatus(Integer templateStatus) {
        this.templateStatus = templateStatus;
    }
}