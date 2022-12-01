package com.youcy.springBootDemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;
import org.springframework.context.annotation.EnableAspectJAutoProxy;

/**
 * 主程序类
 * @SpringBootApplication：这是一个SpringBoot应用
 */

@SpringBootApplication
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MainApplication {
    public static void main(String[] args)  {
        SpringApplication.run(MainApplication.class,args);
    }



}

