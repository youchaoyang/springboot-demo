package com.youcy.springBootDemo.responseDemo.pojo;

import com.sun.istack.internal.NotNull;

import javax.validation.constraints.Max;
import javax.validation.constraints.Min;


/**
 * @Description:
 * @Author cy
 * @Date 2022/8/18
 */

public class UserVo {

    @NotNull()
    private String userName;

    @Min(value = 0, message = "年龄不能为负数")
    @Max(value = 150,message = "年龄不能超过150岁")
    private Integer age;

    private String hobby;

    public UserVo(String userName, Integer age, String hobby) {
        this.userName = userName;
        this.age = age;
        this.hobby = hobby;
    }

    public UserVo() {
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getHobby() {
        return hobby;
    }

    public void setHobby(String hobby) {
        this.hobby = hobby;
    }
}
