package com.youcy.springBootDemo.RandomDemo;

import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Description: 随机数
 * @Author cy
 * @Date 2022/9/17
 */
public class RandomTest {

    /**
     * 使用Random方法生成随机数
     */
    @Test
    public void test01() {
        /**
         * 生成15个1-100范围内的随机int类型数据，取前10个，并进行排序
         */
        Random random = new Random();
        IntStream sorted = random.ints(15, 1, 100).limit(10).sorted();
        sorted.forEach(System.out::println);
    }

    /**
     * 使用Math.Random生成随机数
     */
    @Test
    public void test02() {

        /**
         * 生成[0,10)范围内的随机整数： 0—9
         */
        int a = (int) (Math.random() * 10);

        /**
         * 生成（0,10] 范围内的随机整数：1-10
         */
        int b = (int) (Math.random() * 10) + 1;

        /**
         * 生成(0,10) 范围内的随机整数：1-9
         */
        int c = (int) (Math.random() * (10-1)) + 1;

        /**
         * 生成[0,10] 范围内的随机整数：0-10
         */
        int d = (int) (Math.random() * (10+1));
    }
}
