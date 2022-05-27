package com.euripidess.credit_management;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication

@MapperScan(basePackages = "com.euripidess.credit_management.dao")
public class CreditManagementApplication {

    public static void main(String[] args) {

        SpringApplication.run(CreditManagementApplication.class, args);
    }

}
