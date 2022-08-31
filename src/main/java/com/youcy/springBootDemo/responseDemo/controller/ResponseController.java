package com.youcy.springBootDemo.responseDemo.controller;

import com.youcy.springBootDemo.responseDemo.APIException;
import com.youcy.springBootDemo.responseDemo.AppCode;
import com.youcy.springBootDemo.responseDemo.NotControllerResponseAdvice;
import com.youcy.springBootDemo.responseDemo.pojo.UserVo;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/18
 */
@RestController
@RequestMapping("response")
public class ResponseController {

    @PostMapping("/test01")
    public UserVo findByVo(@Validated @RequestBody UserVo vo) {
        int a = 1/0;
        return vo;
    }

    @GetMapping("/health")
    @NotControllerResponseAdvice
    public String health() {
        return "success";
    }

    @PostMapping("/getOrder")
    public String getOrder(@RequestParam Integer orderId) {
        if (orderId == 1) {
            return "aaa";
        } else {
            throw new APIException(AppCode.ORDER_NOT_EXIST, "订单号不存在：" + orderId);
        }
    }
}
