package com.applet.api.entity;

/**
 * Created by zhouhuahu on 2018/7/9.
 */
public class GoodsResult {
    private String goodsName;
    private String imgUrl;
    private Integer typeId;
    private Double oldPrice;
    private Double newPrice;
    private String startDate;
    private String endDate;
    private Integer goodsRepertory;
    private Integer goodsSales;

    public String getGoodsName() {
        return goodsName;
    }

    public void setGoodsName(String goodsName) {
        this.goodsName = goodsName;
    }

    public String getImgUrl() {
        return imgUrl;
    }

    public void setImgUrl(String imgUrl) {
        this.imgUrl = imgUrl;
    }

    public Integer getTypeId() {
        return typeId;
    }

    public void setTypeId(Integer typeId) {
        this.typeId = typeId;
    }

    public Double getOldPrice() {
        return oldPrice;
    }

    public void setOldPrice(Double oldPrice) {
        this.oldPrice = oldPrice;
    }

    public Double getNewPrice() {
        return newPrice;
    }

    public void setNewPrice(Double newPrice) {
        this.newPrice = newPrice;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public Integer getGoodsRepertory() {
        return goodsRepertory;
    }

    public void setGoodsRepertory(Integer goodsRepertory) {
        this.goodsRepertory = goodsRepertory;
    }

    public Integer getGoodsSales() {
        return goodsSales;
    }

    public void setGoodsSales(Integer goodsSales) {
        this.goodsSales = goodsSales;
    }
}
