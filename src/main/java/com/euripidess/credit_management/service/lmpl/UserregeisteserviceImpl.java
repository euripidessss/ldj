package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.dao.CUserDao;
import com.euripidess.credit_management.pojo.entity.CUser;
import com.euripidess.credit_management.service.UserRegeisteService;
import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;


@Service
public class UserregeisteserviceImpl implements UserRegeisteService {
    @Resource
    CUserDao cUserDao;

    @Override
    public boolean regeist(CUser cUser, HttpSession session) {
        CUser dbuser=cUserDao.selectByUser(cUser.getAccount());
        //先判断用户是否存在，不存在进行注册

        if(dbuser==null){
            cUser.setStatus("正常");
            cUserDao.insert(cUser);//注册
            CUser userid=cUserDao.selectOneByUserid(cUser.getAccount());//根据账号获取用户id
            session.removeAttribute("userid");
            session.setAttribute("userid",userid.getUserid());//将用户id保存进redis缓存中
            session.setAttribute("usermessid",userid.getUserid());
            return true;

        }
        if(dbuser.getAccount().equals(cUser.getAccount())){
                return false;
        }
        else{
            return false;
        }
    }
}
