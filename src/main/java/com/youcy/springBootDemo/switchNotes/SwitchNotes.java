package com.youcy.springBootDemo.switchNotes;

import org.junit.Test;

import java.util.Random;
import java.util.stream.IntStream;

/**
 * @Description: switch
 * @Author cy
 * @Date 2022/9/18
 */
public class SwitchNotes {

    @Test
    public void test01(){
        // 生成1-5内的整数
        int b = (int) (Math.random() * 5) + 1;
        switch (b) {
            case 1:
                System.out.println("这是1");
                break;
            case 2:
                System.out.println("这是2");
                break;
            case 3:
                System.out.println("这是3");
                break;
            case 4:
                System.out.println("这是4");
                break;
            case 5:
                System.out.println("这是5");
                break;
            default:
                break;
        }
    }
}
