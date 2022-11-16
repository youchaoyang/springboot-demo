package com.youcy.springBootDemo.test.model;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/18
 */
@Data
@AllArgsConstructor
@NoArgsConstructor
public class User {

    private Integer id;

    private String username;

    private Integer age;

    private String hobby;

    private Integer weight;

    private Integer petId;

    private Integer classId;

}
