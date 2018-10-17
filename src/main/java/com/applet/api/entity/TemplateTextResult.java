package com.applet.api.entity;

/**
 * Created by zhouhuahu on 2018/7/9.
 */
public class TemplateTextResult {
    private Integer textType;
    private String typeName;
    private String textContent;

    public Integer getTextType() {
        return textType;
    }

    public void setTextType(Integer textType) {
        this.textType = textType;
    }

    public String getTypeName() {
        return typeName;
    }

    public void setTypeName(String typeName) {
        this.typeName = typeName;
    }

    public String getTextContent() {
        return textContent;
    }

    public void setTextContent(String textContent) {
        this.textContent = textContent;
    }
}
