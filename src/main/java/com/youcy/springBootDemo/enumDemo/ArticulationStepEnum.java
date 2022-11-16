package com.youcy.springBootDemo.enumDemo;

import lombok.AllArgsConstructor;
import lombok.Getter;

@Getter
@AllArgsConstructor
public enum ArticulationStepEnum {

    FIRST_STEP(1,"一阶段"),
    SECOND_STEP(2,"二阶段"),
    THIRD_STEP(3,"三阶段"),
    MOUTH_SPORT_ELECTIVE(4,"口部运动选修"),
    FOURTH_STEP_COMPULSORY(5,"四阶段必修"),
    FOURTH_STEP_ELECTIVE(6,"四阶段选修"),
    FIFTH_STEP(7,"五阶段"),
    SIXTH_STEP(8,"六阶段"),
    ;

    public static String getValueByCode(Integer code){
        for (ArticulationStepEnum articulationStepEnum : ArticulationStepEnum.values()) {
            if(articulationStepEnum.code.equals(code)){
                return articulationStepEnum.value;
            }
        }
        return null;
    }


    private Integer code;
    private String value;
}
