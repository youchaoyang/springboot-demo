//package com.youcy.springBootDemo.exceptionDemo;
//
//import org.springframework.http.HttpStatus;
//import org.springframework.http.ResponseEntity;
//import org.springframework.http.converter.HttpMessageNotReadableException;
//import org.springframework.web.HttpRequestMethodNotSupportedException;
//import org.springframework.web.bind.MethodArgumentNotValidException;
//import org.springframework.web.bind.annotation.ControllerAdvice;
//import org.springframework.web.bind.annotation.ExceptionHandler;
//import org.springframework.web.bind.annotation.RestControllerAdvice;
//
///**
// * 全局异常处理
// */
//@RestControllerAdvice
//public class GlobalExceptionHandler {
//
//
//    //该注解用于捕获所有控制器里面的异常，并进行处理
//    @ExceptionHandler(Exception.class)
//    public ResponseEntity<ExceptionResult> failed(Exception e){
//        String msg = "服务器出现未知异常";
//        ExceptionResult exceptionResult = ExceptionResult.fail(500, msg);
//        //业务异常
//        if (e instanceof BaseException) {
//            exceptionResult.setCode(((BaseException) e).getCode());
//            msg = e.getMessage();
//        }
//
//        //不合法、不正确的参数
//        if (e instanceof IllegalArgumentException) {
//            msg = e.getMessage();
//        }
//
//        //接口异常 前端页面传过来的参数与你controller接收的参数类型不匹配
//        if (e instanceof HttpMessageNotReadableException) {
//            msg = "请求参数不合规，请校验后重新提交";
//        }
//
//        //参数校验异常
//        if (e instanceof MethodArgumentNotValidException) {
//            msg = ((MethodArgumentNotValidException) e).getBindingResult().getFieldError().getDefaultMessage();
//        }
//
//        if (e instanceof HttpRequestMethodNotSupportedException) {
//            msg = "不支持的请求方式";
//        }
//
//        String exceptionClassName = e.getClass().getName();
//        exceptionClassName =exceptionClassName.substring(exceptionClassName.lastIndexOf('.') + 1);
//        exceptionResult.setMessage(msg);
//        return new ResponseEntity<>(exceptionResult, HttpStatus.OK);
//    }
//}