package com.youcy.springBootDemo.jdk8Demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/8
 */

@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jdk8User {

    private Integer id;
    private String userName;
    private Integer age;
    private String hobby;
}
