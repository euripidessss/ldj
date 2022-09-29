package com.euripidess.credit_management.controller.font;

import com.euripidess.credit_management.dao.CUserDao;
import com.euripidess.credit_management.pojo.entity.AssetInformation;
import com.euripidess.credit_management.pojo.entity.CUser;
import com.euripidess.credit_management.service.GetSessionService;
import com.euripidess.credit_management.service.UserRegeisteService;
import com.euripidess.credit_management.service.UserService;
import org.springframework.stereotype.Controller;

import org.springframework.ui.Model;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;


import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/")
public class LoginContrller {

        @RequestMapping("/")//登录主页请求
        String loginpage(){
            return "login";}

        @RequestMapping("/logout")//退出主页请求
        String logout(HttpSession session){
            session.removeAttribute("userid");//清除缓存
            return "login";
        }

        @Resource
        UserService userService;
        @Resource
        CUserDao cUserDao;

        @RequestMapping("/login")//登录请求
        String login_request(CUser cUser, HttpSession session, Model model, AssetInformation assetInformation){
            if("".equals(cUser.getAccount())||"".equals(cUser.getPassword())){
                model.addAttribute("erromesg","请输入账号或密码!");
                return "/login";
            }
            boolean loginReault = userService.login(cUser,session,model);
            //String userid=getSessionService.getsession(session);//两种获取session的方式
            //String userid=(String) session.getAttribute("userid") ;
            if(loginReault) {
                CUser userdb=cUserDao.selectByPrimaryKey((Integer) session.getAttribute("userid"));//根据用户id查找用户名并传值
                model.addAttribute("username",userdb.getAccount());
                session.setAttribute("666","666");
                System.out.println(session.getAttribute("ceshi"));
                return "index";
            }else{
                model.addAttribute("erromesg","账号或密码错误!");
                return "/login";
            }

        }

        @RequestMapping("/registepage")//跳转注册页面请求
        String registepage_request(){
            return "registepg";
        }

        @RequestMapping("/loginpage")//跳转登录页面请求
        String loginpage_request(){
        return "login";
    }

        @Resource
        UserRegeisteService userRegeisteService;

        @RequestMapping("/registe")//注册请求
        String registe_request(CUser cUser,HttpSession session,Model model){
            boolean dfl=userRegeisteService.regeist(cUser,session);
            if (dfl){
                CUser username=cUserDao.selectAccount((Integer) session.getAttribute("userid"));
                model.addAttribute("username",username.getAccount());

                return "index";}
            else {
                model.addAttribute("errormes","注册失败。该用户已存在!");
                return "registepg";
            }


        }



//    @RequestMapping("/ControllerA")
//    String A(Model model){
//        model.addAttribute("param", "需要传递的参数");
//        return "vale_of";
//    }

    @RequestMapping("/ControllerA")
    public String A(Model model){
        model.addAttribute("param", "需要传递的参数");
        return "redirect:/usermes/ControllerB";
    }

}
