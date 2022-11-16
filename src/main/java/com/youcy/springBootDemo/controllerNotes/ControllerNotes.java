package com.youcy.springBootDemo.controllerNotes;

import com.youcy.springBootDemo.enumDemo.ArticulationStepEnum;
import com.youcy.springBootDemo.test.model.User;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Description: controller层笔记
 * @Author cy
 * @Date 2022/9/18
 */
@RestController
@RequestMapping("controller")
public class ControllerNotes {

    /**
     * 查询数据用GET
     * - @RequestParam(路径参数：必须要传)： http://localhost:8088/controller/test?id=1
     *   当参数是枚举类型，URL中需要传入枚举类型的枚举名 http://localhost:8088/controller/test?id=1&articulationStepEnum=FIRST_STEP
     * - 当参数是普通实体类，没有加注解，此时请求参数中参数名符合实体类中的属性名就会被匹配到
     *   http://localhost:8088/controller/test?abc=1&articulationStepEnum=FIRST_STEP&id=2&username=aaa&age=12
     * - 当参数类型是普通类型没有加@RequestParam,依然是参数名能匹配上就可以（与@RequestParam的区别是 此时可以不传该参数）
     *   http://localhost:8088/controller/test?abc=1&articulationStepEnum=FIRST_STEP&id=2&username=aaa&age=12&str=str
     */
    @GetMapping("test")
    public void test01(@RequestParam Integer abc,
                       @RequestParam ArticulationStepEnum articulationStepEnum,
                       User user,
                       String str
                       ){
        System.out.println("=================================================");
        System.out.println(abc);
        System.out.println(articulationStepEnum.getValue());
        System.out.println(user);
        System.out.println(str);
    }
}
