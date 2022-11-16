package com.youcy.springBootDemo.jdk8Demo.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/17
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Jdk8Dog {
    private int id;

    private  String name;

    private int masterId;

    private String masterName;
}
