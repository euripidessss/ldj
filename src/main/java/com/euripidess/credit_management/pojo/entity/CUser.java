package com.euripidess.credit_management.pojo.entity;

import java.io.Serializable;
import java.util.Date;


/**
 * c_user
 * @author 
 */
public class CUser implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 账号
     */
    private String account;

    /**
     * 密码
     */
    private String password;

    /**
     * 注册时间
     */
    private Date registrationTime;

    /**
     * 用户状态
     */

    private String status;


    private CUserMessage cUserMessage;//连接用户信息表

    private AssetInformation assetInformation;//连接资产信息表


    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getAccount() {
        return account;
    }

    public void setAccount(String account) {
        this.account = account;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getRegistrationTime() {
        return registrationTime;
    }

    public void setRegistrationTime(Date registrationTime) {
        this.registrationTime = registrationTime;
    }


    public CUserMessage getcUserMessage() {
        return cUserMessage;
    }

    public void setcUserMessage(CUserMessage cUserMessage) {
        this.cUserMessage = cUserMessage;
    }

    public AssetInformation getAssetInformation() {
        return assetInformation;
    }

    public void setAssetInformation(AssetInformation assetInformation) {
        this.assetInformation = assetInformation;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

}