package com.youcy.springBootDemo.arrayDemo;

import org.junit.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 数组操作
 * @Author cy
 * @Date 2022/9/18
 */
public class ArrayNotes {

    @Test
    public void test01(){
        /**
         * 1、字符串切割成数组
         * 2、数组通过流转换成集合
         */
        String str = "1,2,3,4";
        String[] split = str.split(",");
        List<Integer> list = Arrays.stream(split).map(Integer::parseInt).collect(Collectors.toList());
        System.out.println(list);
    }
}
