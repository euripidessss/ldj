package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.dao.CUserMessageDao;
import com.euripidess.credit_management.pojo.entity.CUserMessage;
import com.euripidess.credit_management.service.infService;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

/**
 * @author: Euripides
 * @date: 2022/3/9 12:56
 * @description:
 */
@RestController
@Service
public class infServiceImpl implements infService {
    @Resource
    CUserMessageDao cUserMessageDao;

    @Override
    public boolean infinspection(HttpSession session) {
        CUserMessage dbMess=cUserMessageDao.selectByPrimaryKey((Integer) session.getAttribute("userid"));
        if(dbMess==null){
            return false;
        }else{
            if(dbMess.getUserid()==null){
                return false;
            }
            if(dbMess.getUserid()!=null){
                return true;
            }

        }
        return false;
    }
}
