package com.youcy.springBootDemo.jdk8Demo;

import com.google.common.collect.ImmutableMap;
import com.youcy.springBootDemo.enumDemo.LearningStatusGroupEnum;
import com.youcy.springBootDemo.jdk8Demo.model.Jdk8Dog;
import com.youcy.springBootDemo.jdk8Demo.model.Jdk8User;
import com.youcy.springBootDemo.jdk8Demo.model.Student;
import com.youcy.springBootDemo.jdk8Demo.model.TrainingPlanDetailCountDTO;
import org.junit.Test;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Date;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.TreeSet;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * @Description: Stream流使用
 * @Author cy
 * @Date 2022/9/15
 */
public class StreamDemo {


    /**
     * 过滤(去空，去空串)
     * 映射(取出某个字段)
     * 去重(取出重复数据)
     * 收集(收集成List)
     */
    @Test
    public void Test01() {
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小A", 12, "1");
        Jdk8User jdk8User2 = new Jdk8User(2, "小B", 12, "2");
        Jdk8User jdk8User3 = new Jdk8User(3, "小C", 12, "3");
        Jdk8User jdk8User4 = new Jdk8User(4, "小D", 12, "4");
        Jdk8User jdk8User5 = new Jdk8User(5, "小E", 12, "5");
        Jdk8User jdk8User6 = new Jdk8User(6, "小F", 12, "5");
        Jdk8User jdk8User7 = new Jdk8User(7, "小G", 12, null);
        Jdk8User jdk8User8 = new Jdk8User(8, "小H", 12, "");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        jdk8Users.add(jdk8User7);
        jdk8Users.add(jdk8User8);

        List<Integer> collect = jdk8Users
                .stream()
                .filter(p -> p.getHobby() != null && !"".equals(p.getHobby()))
                .map(p -> Integer.valueOf(p.getHobby()))
                .distinct()
                .collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    /**
     * toMap:key是对象的属性,value是对应的对象或者对象的属性
     */
    @Test
    public void test02() {
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 12, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 12, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 12, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小土", 12, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        Map<Integer, Jdk8User> collect1 = jdk8Users.stream().collect(Collectors.toMap(Jdk8User::getId, v -> v));
        collect1.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println("----------------------------------");
        // 或者
        /**
         * Function.identity()返回一个输出跟输入一样的Lambda表达式对象，等价于形如t -> t形式的Lambda表达式。
         */
        Map<Integer, Jdk8User> collect2 = jdk8Users.stream().collect(Collectors.toMap(Jdk8User::getId, Function.identity()));
        collect2.forEach((key, value) -> System.out.println(key + ":" + value));
        System.out.println("----------------------------------");
        Map<Integer, String> collect3 = jdk8Users.stream().collect(Collectors.toMap(Jdk8User::getId, Jdk8User::getUserName));
        collect3.forEach((key, value) -> System.out.println(key + ":" + value));

    }


    /**
     * groupingBy: key:按某个条件进行分组，value：满足条件的集合
     */
    @Test
    public void test03() {
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 12, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 13, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小土", 13, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        Map<Integer, List<Jdk8User>> collect = jdk8Users.stream().collect(Collectors.groupingBy(Jdk8User::getAge));
        collect.forEach((key, value) -> System.out.println(key + ":" + value));
    }

    /**
     * 通过map映射生成其他List
     */
    @Test
    public void test04() {
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 12, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 13, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小土", 13, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        List<Jdk8Dog> collect = jdk8Users.stream().map(p -> {
            Jdk8Dog jdk8Dog = new Jdk8Dog();
            jdk8Dog.setMasterId(p.getId());
            jdk8Dog.setMasterName(p.getUserName());
            return jdk8Dog;
        }).collect(Collectors.toList());
        collect.forEach(System.out::println);
    }

    /**
     * 使用map和ImmutableMap.of 构造一个List<Map<String, ? extends Serializable>> 类型的 List
     */
    @Test
    public void test05() {
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 12, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 13, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小土", 13, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        List<Map<String, ? extends Serializable>> list = jdk8Users.stream().map(p -> ImmutableMap.of(
                "name", p.getUserName(),
                "hobby", p.getHobby(),
                "age", p.getAge()
        )).collect(Collectors.toList());
        list.forEach(System.out::println);
    }

    @Test
    public void test06(){
        // TODO
        TrainingPlanDetailCountDTO trainingPlanDetailCountDTO1 = new TrainingPlanDetailCountDTO();
        trainingPlanDetailCountDTO1.setCountColumnValue(1);
        trainingPlanDetailCountDTO1.setCount(10L);
        TrainingPlanDetailCountDTO trainingPlanDetailCountDTO2 = new TrainingPlanDetailCountDTO();
        trainingPlanDetailCountDTO2.setCountColumnValue(2);
        trainingPlanDetailCountDTO2.setCount(20L);

        Map<Integer, TrainingPlanDetailCountDTO> collect = new HashMap<>();
        collect.put(1,trainingPlanDetailCountDTO1);
        collect.put(2,trainingPlanDetailCountDTO2);

        List<Map<String, ? extends Serializable>> results = Arrays.stream(LearningStatusGroupEnum.values()) // 数组stream
                .map(a -> ImmutableMap.of(
                        "value", a.name(),
                        "text", a.getText(),
                        "count", Arrays.stream(a.getLearningStatus()) // a.getLearningStatus() 又获得了一个枚举数组
                                .mapToLong(l -> Optional.ofNullable(collect.get(l.getCategory()))
                                        .map(TrainingPlanDetailCountDTO::getCount)
                                        .orElse(0L))
                                .sum()))
                .collect(Collectors.toList());
        results.forEach(System.out::println);

    }

    @Test
    public void test07(){
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 13, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 14, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小A", 14, "保龄球");
        Jdk8User jdk8User7 = new Jdk8User(7, "小B", 15, "保龄球");
        Jdk8User jdk8User8 = new Jdk8User(8, "小C", 15, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        jdk8Users.add(jdk8User7);
        jdk8Users.add(jdk8User8);
        Map<Integer, List<Jdk8User>> collect = jdk8Users.stream().collect(Collectors.groupingBy(Jdk8User::getAge));
//        System.out.println(collect);
        AtomicInteger count = new AtomicInteger();
        System.out.println(count);
        List<Jdk8User> list = new ArrayList<>();
        collect.forEach((key,value) -> {
            if (count.get() < 3) {
                list.addAll(value);
                count.getAndIncrement();
            }
        });
        System.out.println(list);
    }

    /**
     * 根据某个字段去重
     */
    @Test
    public void test08(){
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(2, "小陈", 13, "rap");
        Jdk8User jdk8User4 = new Jdk8User(3, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(3, "小绿", 14, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(4, "小A", 14, "保龄球");
        Jdk8User jdk8User7 = new Jdk8User(6, "小B", 15, "保龄球");
        Jdk8User jdk8User8 = new Jdk8User(6, "小C", 15, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        jdk8Users.add(jdk8User7);
        jdk8Users.add(jdk8User8);

        Map<Object, Boolean> map = new HashMap<>();
        List<Jdk8User> distinctNameBooks4 = jdk8Users.stream().filter(i -> map.putIfAbsent(i.getId(), Boolean.TRUE) == null).collect(Collectors.toList());
        System.out.println(distinctNameBooks4);
        System.out.println(map);

//        Map<Integer, List<Jdk8User>> collect = jdk8Users.stream().collect(Collectors.groupingBy(Jdk8User::getId));

    }

    /**
     * 根据某两个字段去重
     */
    @Test
    public void test09(){
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(2, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(2, "小陈", 12, "rap");
        Jdk8User jdk8User4 = new Jdk8User(3, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(3, "小绿", 13, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小A", 14, "保龄球");
        Jdk8User jdk8User7 = new Jdk8User(6, "小B", 15, "保龄球");
        Jdk8User jdk8User8 = new Jdk8User(6, "小C", 15, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        jdk8Users.add(jdk8User7);
        jdk8Users.add(jdk8User8);

        List<Jdk8User> list = jdk8Users.stream().collect(Collectors.collectingAndThen(Collectors.toCollection(() -> new TreeSet<>(Comparator.comparing(o -> o.getId() + ";" + o.getAge()))), ArrayList::new));
        System.out.println(list);


    }

    @Test
    public void test12(){
        List<Student> list = new ArrayList<>();
        Student s1 = new Student("a", 11, new Date(2020, 1, 1));
        Student s2 = new Student("b", 12, new Date(2020, 1, 2));
        Student s3 = new Student("c", 13, null);
        list.add(s1);
        list.add(s2);
        list.add(s3);
        // 有空值空值排前面
        list = list.stream().sorted(Comparator.comparing(Student::getBirthday,Comparator.nullsFirst(Comparator.naturalOrder ()))).collect(Collectors.toList()); // 升序
        list = list.stream().sorted(Comparator.comparing(Student::getBirthday,Comparator.nullsFirst(Comparator.reverseOrder()))).collect(Collectors.toList()); // 降序
        System.out.println(list);
    }


    @Test
    public void test13(){
        List<Jdk8User> jdk8Users = new ArrayList<>();
        Jdk8User jdk8User1 = new Jdk8User(1, "小明", 12, "唱");
        Jdk8User jdk8User2 = new Jdk8User(2, "小红", 12, "跳");
        Jdk8User jdk8User3 = new Jdk8User(3, "小陈", 13, "rap");
        Jdk8User jdk8User4 = new Jdk8User(4, "小花", 13, "羽毛球");
        Jdk8User jdk8User5 = new Jdk8User(5, "小绿", 14, "乒乓球");
        Jdk8User jdk8User6 = new Jdk8User(6, "小A", 14, "保龄球");
        Jdk8User jdk8User7 = new Jdk8User(7, "小B", 15, "保龄球");
        Jdk8User jdk8User8 = new Jdk8User(8, "小C", 15, "保龄球");
        jdk8Users.add(jdk8User1);
        jdk8Users.add(jdk8User2);
        jdk8Users.add(jdk8User3);
        jdk8Users.add(jdk8User4);
        jdk8Users.add(jdk8User5);
        jdk8Users.add(jdk8User6);
        jdk8Users.add(jdk8User7);
        jdk8Users.add(jdk8User8);
        Map<Integer, List<Jdk8User>> collect = jdk8Users.stream().collect(Collectors.groupingBy(Jdk8User::getAge));
        collect.forEach((key,value) -> {
            System.out.println(value);
        });
    }

}
