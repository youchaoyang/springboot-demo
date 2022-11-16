package com.youcy.springBootDemo.collectionDemo;

import com.google.common.collect.ImmutableMap;
import com.youcy.springBootDemo.jdk8Demo.model.Jdk8Dog;
import com.youcy.springBootDemo.jdk8Demo.model.Jdk8User;
import org.junit.Test;

import java.io.Serializable;
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * @Description: 集合框架
 * @Author cy
 * @Date 2022/9/17
 */
public class CollectionDemo {

    /**
     * ImmutableMap : 不可变Map,初始化后，不可以进行put、remove等变化操作
     */
    @Test
    public void test01() {
        /**
         * 写法一 ： 先builder获取ImmutableMap.Builder对象再build获取ImmutableMap或者Map对象
         */
        ImmutableMap.Builder<String, Object> request = ImmutableMap.builder();
        request.put("one", "1");
        request.put("two", "2");
        request.put("three", "3");
        Map<String, Object> map = request.build();
        map.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        // map.put("1","2"); // 会抛出不支持操作的异常

        System.out.println("------------------------------------------------------");

        /**
         * 写法二（推荐） ： 直接链式调用build构造ImmutableMap或者Map对象
         */
        Map<String, Object> map1 = new ImmutableMap.Builder<String, Object>()
                .put("1", 123)
                .put("2", 456)
                .build();
        map1.forEach((key, value) -> {
            System.out.println(key + ":" + value);
        });
        // map1.put("1",789); // 会抛出不支持操作的异常
        // map1.remove("1"); // 会抛出不支持操作的异常


        System.out.println("---------------------------------------------------");
        /**
         * 写法三（推荐） ： 使用ImmutableMap.of来构建
         */
        ImmutableMap<String, Object> of = ImmutableMap.of(
                "1", new Jdk8User(1, "小明", 12, "玩"),
                "2", new Jdk8User(2, "小红", 13, "学"),
                "3", 1
        );
        of.forEach((key,value) -> {
            System.out.println(key + ":" + value);
        });
    }

    /**
     *  返回空集合(List)
     */
    @Test
    public void test02(){
        List<Object> list = Collections.emptyList();
        System.out.println(list);
    }
}
