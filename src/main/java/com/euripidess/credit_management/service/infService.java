package com.euripidess.credit_management.service;

import javax.servlet.http.HttpSession;

/**
 * @author: Euripides
 * @date: 2022/3/9 12:54
 * @description:在调用所有功能前进行用户信息完善的检验
 */
public interface infService {
    boolean infinspection(HttpSession session);
}
