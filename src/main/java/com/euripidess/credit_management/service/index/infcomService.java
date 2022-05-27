package com.euripidess.credit_management.service.index;

import com.euripidess.credit_management.pojo.entity.AssetInformation;
import com.euripidess.credit_management.pojo.entity.CUserMessage;

import javax.servlet.http.HttpSession;
import java.util.List;

public interface infcomService {
    String inc(CUserMessage cUserMessagte, HttpSession session , AssetInformation assetInformation);
}
