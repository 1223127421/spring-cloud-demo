package com.entity;

import io.swagger.annotations.ApiModelProperty;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/8 11:23
 * @Describe
 */
public class Tuser {

    @ApiModelProperty(value = "姓名")
    private String name;

    @ApiModelProperty(value = "年龄")
    private Integer age;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }
}
