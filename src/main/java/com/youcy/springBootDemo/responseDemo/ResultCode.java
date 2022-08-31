package com.youcy.springBootDemo.responseDemo;

import lombok.Getter;

@Getter
public enum ResultCode implements StatusCode {
    SUCCESS(200, "请求成功"),
    FAILED(500, "请求失败"),
    VALIDATE_ERROR(555, "参数校验失败"),
    RESPONSE_PACK_ERROR(556, "response返回包装失败");

    private int code;
    private String msg;

    ResultCode(int code, String msg) {
        this.code = code;
        this.msg = msg;
    }

}
