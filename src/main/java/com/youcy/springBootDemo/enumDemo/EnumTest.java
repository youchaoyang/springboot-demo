package com.youcy.springBootDemo.enumDemo;

import org.junit.Test;

import java.util.List;

/**
 * @Description:
 * @Author cy
 * @Date 2022/9/18
 */
public class EnumTest {

    @Test
    public void test01() {
        /**
         * 调用自定义的根据code获取value
         */
        String valueByCode = ArticulationStepEnum.getValueByCode(1);
        System.out.println(valueByCode);
        System.out.println("========================");

        /**
         * 调用values()方法
         * 参数： 无
         * 返回： Enum数组
         */
        ArticulationStepEnum[] values = ArticulationStepEnum.values();
        for (ArticulationStepEnum articulationStepEnum :  values) {
            System.out.println(articulationStepEnum);
        }
        System.out.println("========================");

        /**
         * 调用valueOf方法
         * 参数：Enum枚举名
         * 返回： Enum对象
         */
        ArticulationStepEnum articulationStepEnum = ArticulationStepEnum.valueOf("FIRST_STEP");
        System.out.println(articulationStepEnum.getCode());

    }

    @Test
    public void test02(){
        /**
         * ArticulationStepEnum.name(): 返回枚举名
         */
        ArticulationStepEnum[] values = ArticulationStepEnum.values();
        String name = values[0].name();
        System.out.println(name);

    }
}
