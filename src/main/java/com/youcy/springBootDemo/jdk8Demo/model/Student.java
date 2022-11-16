package com.youcy.springBootDemo.jdk8Demo.model;

import java.util.Date;

/**
 * @Description:
 * @Author cy
 * @Date 2022/10/9
 */
public class Student {
    private String name;

    private Integer age;

    private Date Birthday;

    public Student() {
    }

    public Student(String name, Integer age, Date birthday) {
        this.name = name;
        this.age = age;
        Birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", Birthday=" + Birthday +
                '}';
    }
}
