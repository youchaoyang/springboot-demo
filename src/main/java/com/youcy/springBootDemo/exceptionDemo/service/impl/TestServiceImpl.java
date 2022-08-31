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
            int a = 1/0;
        } catch (Exception e) {
            throw new BaseException(555,"自定义异常");
        }

    }
}
