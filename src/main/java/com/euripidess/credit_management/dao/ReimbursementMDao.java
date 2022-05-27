package com.euripidess.credit_management.dao;

import com.euripidess.credit_management.pojo.entity.ReimbursementM;


public interface ReimbursementMDao {
    int deleteByPrimaryKey(ReimbursementM key);

    int insert(ReimbursementM record);

    int insertSelective(ReimbursementM record);

    ReimbursementM selectByPrimaryKey(ReimbursementM key);

    int updateByPrimaryKeySelective(ReimbursementM record);

    int updateByPrimaryKey(ReimbursementM record);
}