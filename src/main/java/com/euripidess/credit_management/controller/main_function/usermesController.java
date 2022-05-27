package com.euripidess.credit_management.controller.main_function;

import com.euripidess.credit_management.pojo.entity.AssetInformation;
import com.euripidess.credit_management.pojo.entity.CUser;
import com.euripidess.credit_management.pojo.entity.CUserMessage;
import com.euripidess.credit_management.service.index.infcomService;
import com.euripidess.credit_management.service.index.usermesService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import javax.annotation.Resource;
import javax.servlet.http.HttpSession;
import java.util.List;


/**
 * @author: Euripides
 * @date: 2022/3/13 16:40
 * @description:用户管理相关功能
// */

@Controller
@RequestMapping("/usermes")

public class usermesController {
    @Resource
    usermesService usermesService;
    @RequestMapping("/usermespage")
    String usermespage(Model model,HttpSession  session){
        List<CUser> usermes = usermesService.usermes();
        model.addAttribute("date",usermes);
        System.out.println("登录"+session.getAttribute("ceshi"));
        return "usermes";
    }




    @Resource
    infcomService infcomService;
    @RequestMapping("/inc")
    @ResponseBody
    String usermesall(CUserMessage cUserMessage, HttpSession session, AssetInformation assetInformation){
//        String inc = infcomService.inc(cUserMessage,session,assetInformation);
        System.out.println((Integer) session.getAttribute("userid"));
        return "";
    }




}































































