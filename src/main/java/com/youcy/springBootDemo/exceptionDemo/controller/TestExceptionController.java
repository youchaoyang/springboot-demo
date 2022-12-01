package com.youcy.springBootDemo.exceptionDemo.controller;

import com.youcy.springBootDemo.exceptionDemo.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/18
 */
@RestController
@RequestMapping("exception")
public class TestExceptionController {
    @Autowired
    private TestService testService;

    @GetMapping("test01")
    public String test01(){
        testService.testService();
        return "test01";
    }


    @GetMapping("test02")
    public String test02(){
        for (int i = 0; i < 10; i++) {
            test01();
        }
        return "test02";
    }

}
