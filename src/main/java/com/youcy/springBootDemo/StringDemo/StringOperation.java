package com.youcy.springBootDemo.StringDemo;

import org.junit.Test;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

/**
 * @Description: 字符串操作
 * @Author cy
 * @Date 2022/9/9
 */
public class StringOperation {

    /**
     * 字符串替换
     * 当替换为""时相当于去除字符串
     */
    @Test
    public void Test01() {
        String str = "[1,2,3,4]";
        String s = str.replaceAll("\\]", "").replaceAll("\\[", "");
        System.out.println(s);
    }

    /**
     * 字符串转Integer
     */
    @Test
    public void Test02() {
        String str = "1";
        Integer integer = Integer.valueOf(str);
        System.out.println(integer);
    }

    /**
     * 字符串按照某个字符切割
     */
    @Test
    public void Test03() {
        String str = "1,2,3,4";
        String[] split = str.split(",");
        for (int i = 0; i < split.length; i++) {
            System.out.println(split[i]);
        }
    }

    /**
     * 把List转换为String
     */
    @Test
    public void Test04() {
        List<Long> processIds = new ArrayList<>();
        processIds.add(1L);
        processIds.add(2L);
        processIds.add(3L);
        processIds.add(4L);

        String s = String.valueOf(processIds);
        System.out.println(s);
    }
}
