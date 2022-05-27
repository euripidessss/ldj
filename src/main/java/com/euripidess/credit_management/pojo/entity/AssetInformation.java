package com.euripidess.credit_management.pojo.entity;

import java.io.Serializable;

/**
 * asset_information
 * @author 
 */
public class AssetInformation implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 信誉等级
     */
    private Integer creditRating;

    /**
     * 信誉积分
     */
    private Integer creditScore;

    /**
     * 黑名单
     */
    private Integer blacklist;

    /**
     * 是否存在待还款金额
     */
    private Integer status;

    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public Integer getCreditRating() {
        return creditRating;
    }

    public void setCreditRating(Integer creditRating) {
        this.creditRating = creditRating;
    }

    public Integer getCreditScore() {
        return creditScore;
    }

    public void setCreditScore(Integer creditScore) {
        this.creditScore = creditScore;
    }

    public Integer getBlacklist() {
        return blacklist;
    }

    public void setBlacklist(Integer blacklist) {
        this.blacklist = blacklist;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }
}