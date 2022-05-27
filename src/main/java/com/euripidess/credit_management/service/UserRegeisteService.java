package com.euripidess.credit_management.service;

import com.euripidess.credit_management.pojo.entity.CUser;

import javax.servlet.http.HttpSession;

public interface UserRegeisteService {
    boolean regeist(CUser cUser, HttpSession session);
}
