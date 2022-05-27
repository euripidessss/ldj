package com.euripidess.credit_management.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * c_user_message
 * @author 
 */
public class CUserMessage implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 电话号码
     */
    private String phone;

    /**
     * 地址
     */
    private String address;

    /**
     * 邮箱
     */
    private String email;

    /**
     * 职业
     */
    private String professiona;

    /**
     * 身份证号
     */
    private String cardno;

    /**
     * 真实姓名
     */
    private String realname;

    /**
     * 学历
     */
    private String record;

    /**
     * 末次登录时间
     */
    private Date loginTime;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getProfessiona() {
        return professiona;
    }

    public void setProfessiona(String professiona) {
        this.professiona = professiona;
    }

    public String getCardno() {
        return cardno;
    }

    public void setCardno(String cardno) {
        this.cardno = cardno;
    }

    public String getRealname() {
        return realname;
    }

    public void setRealname(String realname) {
        this.realname = realname;
    }

    public String getRecord() {
        return record;
    }

    public void setRecord(String record) {
        this.record = record;
    }

    public Date getLoginTime() {
        return loginTime;
    }

    public void setLoginTime(Date loginTime) {
        this.loginTime = loginTime;
    }
}