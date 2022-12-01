package com.youcy.springBootDemo.test;

import com.youcy.springBootDemo.jdk8Demo.model.Jdk8User;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.StringJoiner;
import java.util.stream.Collectors;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/20
 */
public class Test01 {
    public static void main(String[] args) throws InterruptedException {


//        for (int i = 0; i <  10; i++) {
//            System.out.println("开始执行第" + i + "次");
//            sleep();
//
//        }
//
//        }
//        String user = "15695922689";
//        System.out.println(user.startsWith("156"));
//
//        System.out.println( user.substring(5));
//        StringBuilder stb = new StringBuilder();
//        stb.append("hello");
//        stb.append(",");
//        stb.append("world");
//        stb.append(",");
//        stb.append("欢迎使用StringJoiner");
//        System.out.println(stb);


//        String str = "1,2,3";
//        System.out.println(str.contains("2,1"));
//        String replace = str.replace("2,1", "");
//        System.out.println(replace);
//        System.out.println(str);


        List<Long> aaa = new ArrayList<>();
        aaa.add(1L);
        aaa.add(3L);

        for (Long aLong : aaa) {
            sleep(aLong);
        }


        List<Long> bbb = new ArrayList<>();
        bbb.add(3L);
        bbb.add(1L);
        bbb.add(5L);
        System.out.println(bbb);

        bbb.clear();
//        System.out.println(bbb);

//        List<Integer> list = new ArrayList<>();
//        list.add(1);
//        list.add(1);
//        List<Integer> collect = list.stream().distinct().collect(Collectors.toList());
//        System.out.println(collect);

//        String evaProcessStr = list.stream().map(Object::toString).collect(Collectors.joining(","));
//        System.out.println(evaProcessStr);

//        List<Integer> aa = new ArrayList<>();
//        aa.add(1);
//        aa.add(2);
//        aa.add(3);
//        StringJoiner stringJoiner = new StringJoiner(",");
//        aa.forEach(a -> {
//            stringJoiner.add(a.toString());
//        });
//        System.out.println(stringJoiner);
//        double sum = aa.stream().mapToDouble(Integer::intValue).sum();
//        System.out.println(sum);
//        aa.add(1);
//        if (2>1){
//            aa = null;
//        }
//        System.out.println(aa);

//        String aaa = "PPPKKPPP";
//        char[] chars = aaa.toCharArray();
//        for (int i = 0; i < chars.length; i++) {
//            System.out.println(chars[i]);
//        }

//        Long aa = 0L;
//if (Long.valueOf(0).equals(aa)) {
//    System.out.println(aa);
}
//        Integer aa = 1;
//        Integer bb = 2;
//        System.out.println(1*1.0/2);


//        Long aa = 1L;
//        Long vv = 1L;
//        if (aa == vv) {}


//        List<Jdk8User> jdk8Users = new ArrayList<>();
//        Jdk8User jdk8User1 = new Jdk8User(1, "小A", 11, "1");
//        Jdk8User jdk8User2 = new Jdk8User(2, "小B", 11, "2");
//        Jdk8User jdk8User3 = new Jdk8User(3, "小C", 12, "3");
//        Jdk8User jdk8User4 = new Jdk8User(4, "小D", 12, "4");
//        Jdk8User jdk8User5 = new Jdk8User(5, "小E", 12, "5");
//        Jdk8User jdk8User6 = new Jdk8User(6, "小F", 13, "5");
//        Jdk8User jdk8User7 = new Jdk8User(7, "小G", 13, null);
//        Jdk8User jdk8User8 = new Jdk8User(8, "小H", 13, "");
//        jdk8Users.add(jdk8User1);
//        jdk8Users.add(jdk8User2);
//        jdk8Users.add(jdk8User3);
//        jdk8Users.add(jdk8User4);
//        jdk8Users.add(jdk8User5);
//        jdk8Users.add(jdk8User6);
//        jdk8Users.add(jdk8User7);
//        jdk8Users.add(jdk8User8);


//        String aa = "1";
//        String[] split = aa.split(",");
//        for (int i = 0; i < split.length; i++) {
//            System.out.println(split[i]);
//        }


//        List<String> aaa = new ArrayList<>();
//        aaa.add("aaa");
//        aaa.add("bbb");
//        aaa.add("ccc");
//
//        List<String> bbb = new ArrayList<>();
//        bbb.add("aaa");
//        bbb.add("aaa");
//        bbb.add("ccc");
//        List<String> poolList = aaa.parallelStream().filter(x ->
//                bbb.parallelStream().noneMatch(
//                        r -> r.equals(x))
//        ).collect(Collectors.toList());
//        System.out.println(poolList);



//        List<Long> aa = new ArrayList<>();
//        aa.add(1L);
//        aa.add(2L);
//        Integer bb = 3;
//        if(!aa.contains(bb.longValue())){
//            aa.add(bb.longValue());
//        }
//        System.out.println(aa);

//        Integer aa = 2;
//        Long bb = 2L;
//        int cc = 2;
//        if (aa.longValue() == bb) {
//            System.out.println("aa");
//        }
//        if (aa == cc) {
//            System.out.println("aaaa");
//        }
//        List<String> list1 = new ArrayList<>();
//        list1.add("aaa");
//        list1.add("bbb");
//        list1.add("ccc");
//        list1.add("ddd");
//
//        List<String> list2 = new ArrayList<>();
//
//        list2.add("ccc");
//        list1.removeAll(list2);
//        System.out.println(list1);
//
//        String aaa = "123";
//        Long a = 123L;
//        if (aaa.equals(a.toString())) {
//
//        }

    public static void sleep(Long aaa) throws InterruptedException {
        System.out.println("开始休眠");
        System.out.println(aaa);
        System.out.println("休眠结束");
    }
    }

