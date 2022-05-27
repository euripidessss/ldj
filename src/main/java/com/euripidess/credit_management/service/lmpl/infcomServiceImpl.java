package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.dao.AssetInformationDao;
import com.euripidess.credit_management.dao.CUserMessageDao;
import com.euripidess.credit_management.pojo.entity.AssetInformation;
import com.euripidess.credit_management.pojo.entity.CUserMessage;
import com.euripidess.credit_management.service.index.infcomService;
import org.springframework.stereotype.Service;



import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.Objects;

/**
 * @author: Euripides
 * @date: 2022/3/15 10:43
 * @description:
 */
@Service
public class infcomServiceImpl implements infcomService {

    @Resource
    CUserMessageDao cUserMessageDao;
    @Resource
    AssetInformationDao assetInformationDao;
    @Resource
    GetSessionServiceImpl getSessionService;
    @Override
    public String inc(CUserMessage cUserMessage, HttpSession session, AssetInformation assetInformation) {
        Integer getsession = getSessionService.getsession(session);

        System.out.println("传入"+(Integer) session.getAttribute("userid"));
//        cUserMessageDao.insertSelective(cUserMessage);//注册用户基础信息
        assetInformation.setUserid((Integer) session.getAttribute("userid")); //初始化资产信息
        assetInformation.setBlacklist(0);
        assetInformation.setCreditRating(1);
        assetInformation.setCreditScore(500);
        assetInformation.setStatus(1);
//        assetInformationDao.insertSelective(assetInformation);//注册资产信息表
        AssetInformation dbass=assetInformationDao.selectByPrimaryKey((Integer) session.getAttribute("userid"));
        if(dbass==null){
            return "error";
        }
        else{
            if(Objects.equals(dbass.getUserid(), (Integer) session.getAttribute("userid"))){
                return "sessful";
            }
        }
        return "unknown error";
    }
}
