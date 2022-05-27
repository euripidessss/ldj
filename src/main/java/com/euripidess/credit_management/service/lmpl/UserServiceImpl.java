package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.dao.CUserDao;
import com.euripidess.credit_management.dao.CUserMessageDao;
import com.euripidess.credit_management.pojo.entity.CUser;
import com.euripidess.credit_management.service.UserService;
import org.springframework.stereotype.Service;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RestController;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Service
@RestController
public class UserServiceImpl implements UserService {
    @Resource
    CUserDao cUserDao;
    @Resource
    CUserMessageDao cUserMessageDao;

    @Override
    public boolean login(CUser cUser, HttpSession session, Model model) {
        CUser dbuser=cUserDao.selectOneByAccountUser(cUser.getAccount());//根据账号查找密码
        CUser userid=cUserDao.selectOneByUserid(cUser.getAccount());//根据账号获取用户id
        if(dbuser==null){
            return false;
        }else{
            if(cUser.getAccount()==null){
                return  false;
            }
            if(cUser.getPassword().equals(dbuser.getPassword())) {
                session.removeAttribute("userid");//登录前将之前的缓存删除
                session.setAttribute("userid",userid.getUserid());//将用户id保存进redis缓存中
                cUserMessageDao.updateBYlogintime(userid.getUserid());//更新登陆时间
                return true;
            }

        }
        return false;
    }
}
