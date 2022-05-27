package com.euripidess.credit_management.pojo.entity;

import java.io.Serializable;
import java.util.Date;

/**
 * reimbursement_m
 * @author 
 */
public class ReimbursementM  implements Serializable {
    /**
     * 用户id
     */
    private Integer userid;

    /**
     * 交易单号
     */
    private String ocumentno;
    /**
     * 交易时间
     */
    private Date ocumenttime;

    /**
     * 交易类型
     */
    private Integer type;

    /**
     * 交易状态
     */
    private Integer status;
    /**
     * 交易金额
     */
    private Integer amount;



    private static final long serialVersionUID = 1L;

    public Integer getUserid() {
        return userid;
    }

    public void setUserid(Integer userid) {
        this.userid = userid;
    }

    public String getOcumentno() {
        return ocumentno;
    }

    public void setOcumentno(String ocumentno) {
        this.ocumentno = ocumentno;
    }


    public Date getOcumenttime() {
        return ocumenttime;
    }

    public void setOcumenttime(Date ocumenttime) {
        this.ocumenttime = ocumenttime;
    }

    public Integer getType() {
        return type;
    }

    public void setType(Integer type) {
        this.type = type;
    }

    public Integer getStatus() {
        return status;
    }

    public void setStatus(Integer status) {
        this.status = status;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }
}