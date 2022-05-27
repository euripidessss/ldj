package com.euripidess.credit_management.dao;

import com.euripidess.credit_management.pojo.entity.CUserMessage;
import org.apache.ibatis.annotations.Mapper;

public interface CUserMessageDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(CUserMessage record);

    int insertSelective(CUserMessage record);

    CUserMessage selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(CUserMessage record);

    int updateByPrimaryKey(CUserMessage record);

    int updateBYlogintime(int userid);

    CUserMessage selectAllByUserid(int userid);

}