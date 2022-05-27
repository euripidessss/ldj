package com.euripidess.credit_management.dao;

import com.euripidess.credit_management.pojo.entity.AssetInformation;


public interface AssetInformationDao {
    int deleteByPrimaryKey(Integer userid);

    int insert(AssetInformation record);

    int insertSelective(AssetInformation record);

    AssetInformation selectByPrimaryKey(Integer userid);

    int updateByPrimaryKeySelective(AssetInformation record);

    int updateByPrimaryKey(AssetInformation record);
}