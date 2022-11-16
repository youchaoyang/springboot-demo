package com.youcy.springBootDemo.enumDemo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.AllArgsConstructor;
import lombok.Getter;

/**
 * final的成员变量,要么使用直接赋值,要么通过构造方法赋值。二者选其一。
 * - @EnumValue：当数据库字段类型是枚举类型时，用该注解来确定数据库显示的真实数据
 */
@Getter
@AllArgsConstructor
public enum LearningStatusEnum {

    /**
     * 未学习
     */
    UNSTUDIED("unstudied", 0,"未开始", "notStartNum"),

    /**
     * 学习中、新学
     */
    STUDYING("studying", 1,"新学", "newStudyNum"),

    /**
     * 重学
     */
    RESTUDYING("restudying", 3,"重学", "restudyNum"),

    /**
     * 已掌握
     */
    STUDIED("studied", 2,"已掌握", "masteredNum"),

    /**
     * 复习
     */
    RESTUDIED("restudied", 4,"复习", "reviewNum")
    ;

    final String name;

    @EnumValue
    final int category;

    final String text;

    final String settingNumString;

}