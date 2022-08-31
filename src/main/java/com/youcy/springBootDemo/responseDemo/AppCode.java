package com.youcy.springBootDemo.responseDemo;

import lombok.Getter;

@Getter
public enum AppCode implements StatusCode{
    APP_ERROR(5000, "业务异常"),
    ORDER_NOT_EXIST(5001,"订单不存在"),
    PRICE_ERROR(5002, "价格异常");


    private int code;
    private String msg;

    AppCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }
}
