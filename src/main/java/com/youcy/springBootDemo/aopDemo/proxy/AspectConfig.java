package com.youcy.springBootDemo.aopDemo.proxy;

import org.aspectj.lang.ProceedingJoinPoint;
import org.aspectj.lang.annotation.Around;
import org.aspectj.lang.annotation.Aspect;
import org.aspectj.lang.annotation.Pointcut;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Component;

/**
 * @Description: aop配置:统计调用service的响应时间
 * @Author cy
 * @Date 2022/8/10
 */
@Aspect
@Component
public class AspectConfig {

    @Pointcut("execution(* com.youcy.springBootDemo.aopDemo.service.*.*(..))")
    private void pointCut(){

    }


    @Around("pointCut()")
    public Object around(ProceedingJoinPoint point) throws Throwable {
        long begin = System.currentTimeMillis();
        Object proceed = point.proceed();
        long end = System.currentTimeMillis();
        System.out.println(end - begin + "ms");
        return proceed;
    }
    
}
