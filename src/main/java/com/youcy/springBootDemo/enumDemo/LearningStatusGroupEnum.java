package com.youcy.springBootDemo.enumDemo;

import com.baomidou.mybatisplus.annotation.EnumValue;
import lombok.Getter;

@Getter
public enum LearningStatusGroupEnum {

    /**
     * 未学习
     */
    UNSTUDIED(0, "未开始", LearningStatusEnum.UNSTUDIED),

    /**
     * 学习中、新学
     */
    STUDYING(1, "康复中", LearningStatusEnum.STUDYING, LearningStatusEnum.RESTUDYING),

    /**
     * 已掌握
     */
    STUDIED(2, "已掌握", LearningStatusEnum.STUDIED, LearningStatusEnum.RESTUDIED),
    ;

    @EnumValue
    final int category;

    final String text;

    final LearningStatusEnum[] learningStatus;

    LearningStatusGroupEnum(int category, String text, LearningStatusEnum... learningStatus) {
        this.category = category;
        this.text = text;
        this.learningStatus = learningStatus;
    }
}
