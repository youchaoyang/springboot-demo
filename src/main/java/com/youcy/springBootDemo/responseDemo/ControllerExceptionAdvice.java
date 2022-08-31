package com.youcy.springBootDemo.responseDemo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.validation.ObjectError;
import org.springframework.web.bind.MethodArgumentNotValidException;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/22
 */
@RestControllerAdvice
public class ControllerExceptionAdvice {
    private static final Logger logger = LoggerFactory.getLogger(ControllerExceptionAdvice.class);
    //该注解用于捕获所有控制器里面的异常，并进行处理
    @ExceptionHandler(Throwable.class)
    public ResultVo ExceptionHandler(Throwable e) {
        String msg = "服务器出现未知异常";
        // 自定义业务异常
        if (e instanceof APIException) {
            logger.error(e.getMessage(), e);
            return new ResultVo(((APIException) e).getCode(), ((APIException) e).getMsg(), e.getMessage());
        }


        //参数校验异常
        if (e instanceof MethodArgumentNotValidException) {
            // 从异常对象中拿到ObjectError对象
            ObjectError objectError = ((MethodArgumentNotValidException) e).getBindingResult().getAllErrors().get(0);
            return new ResultVo(ResultCode.VALIDATE_ERROR, objectError.getDefaultMessage());
        }


        String exceptionClassName = e.getClass().getName();
        exceptionClassName = exceptionClassName.substring(exceptionClassName.lastIndexOf('.') + 1);

        return new ResultVo(ResultCode.FAILED, msg+ ":"+exceptionClassName);
    }
}
