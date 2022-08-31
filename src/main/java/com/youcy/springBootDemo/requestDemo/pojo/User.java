package com.youcy.springBootDemo.requestDemo.pojo;

import com.sun.istack.internal.NotNull;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;

/**
 * @Description:
 * @Author cy
 * @Date 2022/8/22
 */
@Getter
@Setter
public class User {
    @NotNull
    private String userName;

    @Min(value = 0, message = "年龄不允许为负数")
    @Max(value = 150, message = "年龄不能超过150岁")
    private Integer age;

    private String hobby;

    public User(String userName, @Min(value = 0, message = "年龄不允许为负数") @Max(value = 150, message = "年龄不能超过150岁") Integer age, String hobby) {
        this.userName = userName;
        this.age = age;
        this.hobby = hobby;
    }

    public User() {
    }
}
