package com.youcy.springBootDemo.aopDemo.model;

import lombok.Data;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/10
 */
@Data
public class User {
    private String userName;
    private Integer age;

    public User(String userName, Integer age) {
        this.userName = userName;
        this.age = age;
    }
}
