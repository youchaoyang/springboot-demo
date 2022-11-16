package com.youcy.springBootDemo.test.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/18
 */
@RestController
@RequestMapping("test")
public class ApplicationController {

    @GetMapping("test")
    public void test(){
        System.out.println("这是一个测试");
    }
}
