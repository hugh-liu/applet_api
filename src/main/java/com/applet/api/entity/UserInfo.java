package com.applet.api.entity;

import com.applet.api.util.NullUtil;

import java.io.Serializable;
import java.util.Date;

public class UserInfo implements Serializable {
    private Integer id;

    private String mobile;

    private String name;

    private String nickName;

    private String password;

    private String encrypted;

    private String avatarUrl;

    private Boolean gender;

    private Date birthday;

    private String email;

    private Boolean isDealer;

    private Double balance;

    private Double freeBalance;

    private Integer integral;

    private Integer goodsCount;

    private Integer country;

    private Integer province;

    private Integer city;

    private Integer county;

    private String address;

    private Date createDate;

    private Boolean status;

    private static final long serialVersionUID = 1L;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getNickName() {
        return nickName;
    }

    public void setNickName(String nickName) {
        this.nickName = nickName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getEncrypted() {
        return encrypted;
    }

    public void setEncrypted(String encrypted) {
        this.encrypted = encrypted;
    }

    public String getAvatarUrl() {
        return avatarUrl;
    }

    public void setAvatarUrl(String avatarUrl) {
        this.avatarUrl = avatarUrl;
    }

    public Boolean getGender() {
        return gender;
    }

    public void setGender(Boolean gender) {
        this.gender = gender;
    }

    public Date getBirthday() {
        return birthday;
    }

    public void setBirthday(Date birthday) {
        this.birthday = birthday;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public Boolean getIsDealer() {
        return isDealer;
    }

    public void setIsDealer(Boolean isDealer) {
        this.isDealer = isDealer;
    }

    public Double getBalance() {
        return balance;
    }

    public void setBalance(Double balance) {
        this.balance = balance;
    }

    public Double getFreeBalance() {
        return freeBalance;
    }

    public void setFreeBalance(Double freeBalance) {
        this.freeBalance = freeBalance;
    }

    public Integer getIntegral() {
        return integral;
    }

    public void setIntegral(Integer integral) {
        this.integral = integral;
    }

    public Integer getGoodsCount() {
        return goodsCount;
    }

    public void setGoodsCount(Integer goodsCount) {
        this.goodsCount = goodsCount;
    }

    public Integer getCountry() {
        return country;
    }

    public void setCountry(Integer country) {
        this.country = country;
    }

    public Integer getProvince() {
        return province;
    }

    public void setProvince(Integer province) {
        this.province = province;
    }

    public Integer getCity() {
        return city;
    }

    public void setCity(Integer city) {
        this.city = city;
    }

    public Integer getCounty() {
        return county;
    }

    public void setCounty(Integer county) {
        this.county = county;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }

    public UserInfoResult getUserInfo(){
        UserInfoResult result = new UserInfoResult();
        result.setMobile(this.mobile);
        result.setNickName(NullUtil.isNotNullOrEmpty(this.nickName) ? this.nickName:this.name);
        result.setAvatarUrl(this.avatarUrl);
        result.setGender(this.gender);
        result.setBirthday(this.birthday);
        result.setBalance(this.balance);
        result.setIntegral(this.integral);
        return result;
    }
}