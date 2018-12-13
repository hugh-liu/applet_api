package com.applet.api.entity;

import java.io.Serializable;
import java.util.Date;

public class GoodsType implements Serializable {
    private Integer id;

    private Integer userTemplateId;

    private String typeIcon;

    private String typeName;

    private Integer typeIndex;

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

    public String getTypeIcon() {
        return typeIcon;
    }

    public void setTypeIcon(String typeIcon) {
        this.typeIcon = typeIcon;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public Integer getTypeIndex() {
        return typeIndex;
    }

    public void setTypeIndex(Integer typeIndex) {
        this.typeIndex = typeIndex;
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