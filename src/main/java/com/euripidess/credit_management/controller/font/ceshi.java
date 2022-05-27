package com.euripidess.credit_management.controller.font;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import javax.servlet.http.HttpSession;

/**
 * @author: Euripides
 * @date: 2022/3/16 20:19
 * @description:
 */
@Controller
public class ceshi {
    @RequestMapping("ceshi")
    @ResponseBody
    String xxxz(HttpSession session){
        session.setAttribute("ceshi","ceshi");

        return "";
    }
}
