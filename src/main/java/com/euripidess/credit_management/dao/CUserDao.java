package com.euripidess.credit_management.dao;

import com.euripidess.credit_management.pojo.entity.CUser;

import java.util.List;


public interface CUserDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(CUser record);

    int insertSelective(CUser record);

    CUser selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(CUser record);

    int updateByPrimaryKey(CUser record);

    CUser selectOneByAccountUser(String account);
    CUser selectOneByUserid(String account);
    CUser selectByUser(String account);
    CUser selectAccount(Integer userid);
    List<CUser> selectALL();
    int  selectMaxByUserid();
}