package com.youcy.springBootDemo.forDemo;

import com.youcy.springBootDemo.jdk8Demo.model.Jdk8User;
import org.junit.Test;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

/**
 * @Description: 各种类型遍历
 * @Author cy
 * @Date 2022/9/16
 */
public class ForDemo {

    /**
     * List 遍历:forEach
     */
    @Test
    public void test01() {
        List<String> ids = new ArrayList<>();
        ids.add("aaa");
        ids.add("bbb");
        ids.add("ccc");
        ids.add("ddd");
        ids.forEach(System.out::println);
    }

    /**
     * Map遍历：forEach
     */
    @Test
    public void test02(){
        Map<String, Jdk8User> map = new HashMap<>();
        map.put("1",new Jdk8User(1,"小明",12,"学习"));
        map.put("2",new Jdk8User(2,"小红",12,"工作"));
        map.put("3",new Jdk8User(3,"小张",12,"娱乐"));

        map.forEach((key,value) -> {
            System.out.println(key + ":" + value);
        });
    }

    /**
     * 去除两个集合中重复的部分
     */
    @Test
    public void test03(){
        List<String> list1 = new ArrayList<>();
        list1.add("111");
        list1.add("222");
        list1.add("333");
        list1.add("444");

        List<String> list2 = new ArrayList<>();
        list2.add("777");
        list2.add("888");
        list2.add("999");
        list2.add("aaa");

        HashSet<String> hashSet2 = new HashSet<>(list2);
        list1.removeAll(hashSet2);
        System.out.println(list1);

//        public static boolean  removeSame(List<Integer> a, List<Integer> b){
//            HashSet<Integer> hashSeta = new HashSet<>();
//            hashSeta.addAll(a);
//            a.removeAll(b);
//            b.removeAll(hashSeta);
//
//            return (a.size()==b.size()); //判断是否相等，如果true 就修改
//        }


    }
    @Test
    public void test11(){
        Boolean b = null;
        if (!b) {
            System.out.println(":aa");
        }
    }
}
