package com.youcy.springBootDemo.exceptionDemo;


import java.io.Serializable;

/**
 * 异常结果
 */
public class ExceptionResult implements Serializable {

    private Integer code;

    private String message;

    public ExceptionResult() {
    }

    public ExceptionResult(Integer code, String message) {
        this.code = code;
        this.message = message;
    }

    public static ExceptionResult fail(Integer code, String message) {
        return new ExceptionResult(code, message);
    }

    public static ExceptionResult fail(String message) {
        return fail(500, message);
    }

    public Integer getCode() {
        return code;
    }

    public void setCode(Integer code) {
        this.code = code;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}