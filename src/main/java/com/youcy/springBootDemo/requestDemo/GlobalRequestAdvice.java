package com.youcy.springBootDemo.requestDemo;

import org.springframework.core.Ordered;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import javax.servlet.http.HttpServletRequest;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/22
 */
@RestControllerAdvice
public class GlobalRequestAdvice {

    @ModelAttribute
    public void authenticationUser(HttpServletRequest request) {
        System.out.println("查询的参数：" + request.getQueryString());
        System.out.println("用户名参数：" + request.getParameter("userName"));
        System.out.println("header1值：" + request.getHeader("header1"));
    }
}
