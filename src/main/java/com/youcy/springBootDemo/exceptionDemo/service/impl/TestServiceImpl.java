package com.youcy.springBootDemo.exceptionDemo.service.impl;

import com.youcy.springBootDemo.exceptionDemo.BaseException;
import com.youcy.springBootDemo.exceptionDemo.service.TestService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/18
 */
@Service
public class TestServiceImpl implements TestService {
    @Override
    public void testService() {

        try {
            System.out.println("test01开始");
            Thread.sleep(5000);
            System.out.println("test01结束");
        } catch (InterruptedException e) {
            e.printStackTrace();
        }


    }
}
