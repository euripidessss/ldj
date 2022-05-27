package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.dao.CUserDao;
import com.euripidess.credit_management.pojo.entity.CUser;
import com.euripidess.credit_management.service.index.usermesService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * @author: Euripides
 * @date: 2022/3/13 17:16
 * @description:
 */
@Service
public class usermesServiceImpl implements usermesService {

    @Resource
    CUserDao cUserDao;
    @Override
    public List<CUser> usermes() {
        List<CUser> dbuser=cUserDao.selectALL();

        return cUserDao.selectALL();
    }


    public CUser selectByPrimaryKey(Integer userid) {
        CUser db=cUserDao.selectByPrimaryKey(1);
        System.out.println(db.getAccount());
        return cUserDao.selectByPrimaryKey(1);
    }
}
