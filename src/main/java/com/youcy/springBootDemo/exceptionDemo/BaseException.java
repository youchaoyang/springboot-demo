package com.youcy.springBootDemo.exceptionDemo;


import java.io.Serializable;

/**
 * 自定义异常类
 */
public class BaseException extends RuntimeException implements Serializable {

    /**
     * 错误码
     */
    private Integer code;

    public BaseException() {

    }

    public BaseException(String s) { this(500,s);}

    public BaseException(Integer code, String s) {

        super(s);
        this.code = code;
    }

    public BaseException(String s, Throwable throwable) {super(s,throwable);}

    public BaseException(Throwable throwable) {super(throwable);}

    public BaseException(String s, Throwable throwable, boolean b, boolean b1) {super(s,throwable,b,b1);}



    public Integer getCode() {return code;}
}