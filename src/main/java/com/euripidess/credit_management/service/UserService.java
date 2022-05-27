package com.euripidess.credit_management.service;

import com.euripidess.credit_management.pojo.entity.CUser;
import org.springframework.ui.Model;

import javax.servlet.http.HttpSession;

public interface UserService {
    boolean login(CUser cUser, HttpSession session, Model model);

}
