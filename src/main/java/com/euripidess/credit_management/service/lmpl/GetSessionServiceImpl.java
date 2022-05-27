package com.euripidess.credit_management.service.lmpl;

import com.euripidess.credit_management.service.GetSessionService;
import org.springframework.stereotype.Service;

import javax.servlet.http.HttpSession;

@Service
public class GetSessionServiceImpl implements GetSessionService {
    @Override
    public Integer getsession(HttpSession session) {
        Integer global_id=(Integer) session.getAttribute("userid");
        return global_id;
    }
}
