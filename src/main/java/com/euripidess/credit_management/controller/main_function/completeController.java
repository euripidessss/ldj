package com.euripidess.credit_management.controller.main_function;

import com.euripidess.credit_management.dao.CUserMessageDao;
import com.euripidess.credit_management.pojo.entity.AssetInformation;
import com.euripidess.credit_management.pojo.entity.CUserMessage;
import com.euripidess.credit_management.service.index.infcomService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.SessionAttributes;

import javax.annotation.Resource;
import javax.servlet.http.HttpSession;

@Controller
@RequestMapping("/main")
public class completeController {

    @RequestMapping("userid")
    public Integer userid(HttpSession session){
        return 1;
    }

    @Resource
    infcomService infcomService;
    @RequestMapping("/infcom")//完善个人信息
    @ResponseBody
    String information_complete(CUserMessage cUserMessage, HttpSession session, AssetInformation assetInformation){
        String inc = infcomService.inc(cUserMessage, session, assetInformation);
        if(inc.equals("sessful")){
            return "完善成功";
        }else{
            return "完善失败";
        }


    }



}
