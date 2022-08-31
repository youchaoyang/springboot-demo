package com.youcy.springBootDemo.aopDemo.controller;

import com.youcy.springBootDemo.aopDemo.model.User;
import com.youcy.springBootDemo.aopDemo.service.AopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import java.lang.reflect.Proxy;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/10
 */
@RestController
public class AopDemoController {

    @Autowired
    AopService aopService;

    @GetMapping("/login")
    public User login(){

        User user = aopService.getUser();
        return user;
    }
}
