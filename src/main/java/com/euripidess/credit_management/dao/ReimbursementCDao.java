package com.euripidess.credit_management.dao;

import com.euripidess.credit_management.pojo.entity.ReimbursementC;


public interface ReimbursementCDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(ReimbursementC record);

    int insertSelective(ReimbursementC record);

    ReimbursementC selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(ReimbursementC record);

    int updateByPrimaryKey(ReimbursementC record);
}