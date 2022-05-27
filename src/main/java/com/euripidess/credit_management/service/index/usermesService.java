package com.euripidess.credit_management.service.index;

import com.euripidess.credit_management.pojo.entity.CUser;

import javax.servlet.http.HttpSession;
import java.util.List;

/**
 * @author: Euripides
 * @date: 2022/3/13 16:52
 * @description:
 */
public interface usermesService {
    List<CUser> usermes();
    CUser selectByPrimaryKey(Integer userid);
}
