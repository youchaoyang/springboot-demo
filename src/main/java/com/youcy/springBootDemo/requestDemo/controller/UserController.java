package com.youcy.springBootDemo.requestDemo.controller;

import com.youcy.springBootDemo.requestDemo.pojo.User;
import com.youcy.springBootDemo.responseDemo.ResultVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.time.LocalDateTime;
import java.util.Date;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/22
 */
@RestController
@RequestMapping("request")
public class UserController {
    @GetMapping("addUser")
    public void save(User user) {
        System.out.println("Controller保存用户：" + user);
    }

    @GetMapping("/initBinder")
    public Object localDateTimeTest(LocalDateTime localDateTime) {
        System.out.println(localDateTime);
        return localDateTime;
    }

    @GetMapping("/str")
    public String strFormat(String str) {
        System.out.println(str);
        return str;
    }

    @PostMapping("/testValidated")
    public String findByVo(@Validated @RequestBody User user) {
       return user.getUserName();
    }

}
