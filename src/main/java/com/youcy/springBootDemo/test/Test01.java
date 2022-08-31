package com.youcy.springBootDemo.test;

import com.youcy.springBootDemo.test.Dog;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Test01 {

//    public static void main(String[] args) {
//        Dog dog = new Dog();
//        new Test01().convert(dog);
//        System.out.println(dog.getName());
//
//        int a = 1;
//        new Test01().convertNum(a);
//        System.out.println(a);
//
//    }
//
//    void convert(Dog dog){
//        dog.setName("大黄");
//    }
//
//    void convertNum(int a){
//        a = 2;
//    }

    public static void main(String[] args) {
        ArrayList<String> string1 = new ArrayList<>();
        string1.add("aaa");
        string1.add("bbb");
        string1.add("ccc");

        ArrayList<String> string2 = new ArrayList<>();
        string2.add("111");
        string2.add("222");
        string2.add("333");
        string2.add("ccc");

        List<String> collect = new ArrayList<>();
        for (String s2: string2
        ) {
            collect = string1.stream().filter(s1 -> s1.equals(s2)).collect(Collectors.toList());
        }

        for (String c:collect
        ) {
            System.out.println(c);
        }
    }
}
