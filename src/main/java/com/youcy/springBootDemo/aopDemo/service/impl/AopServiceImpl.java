package com.youcy.springBootDemo.aopDemo.service.impl;

import com.youcy.springBootDemo.aopDemo.model.User;
import com.youcy.springBootDemo.aopDemo.service.AopService;
import org.springframework.stereotype.Service;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/10
 */
@Service
public class AopServiceImpl implements AopService {

    @Override
    public User getUser() {
        try {
            Thread.sleep(2000);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
        return new User("youcy",26);
    }
}
