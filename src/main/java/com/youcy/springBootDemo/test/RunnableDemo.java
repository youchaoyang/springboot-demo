package com.youcy.springBootDemo.test;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.stream.Collectors;

public class RunnableDemo {
    public static void main(String[] args) {
        Random random = new Random();
        random.ints(50).limit(10).sorted().forEach(System.out::println);
    }

    private static void procJob(String e) {
        System.out.println(e);
    }
}

class ConcurrentTaskExecutor{
    static void execute(List<Runnable> list){
        for (Runnable o :list) {
            o.run();
        }
    }
}