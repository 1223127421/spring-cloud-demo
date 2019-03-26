package com.controller;

import com.entity.Tuser;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiImplicitParam;
import io.swagger.annotations.ApiImplicitParams;
import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/8 10:21
 * @Describe
 */
//@Api：修饰整个类，描述Controller的作用
@RestController
@RequestMapping("tuser")
@Api(value = "tuser控制层")
public class TuserController {

    //@ApiOperation：描述一个类的一个方法，或者说一个接口
    //@ApiImplicitParam：一个请求参数
    @ApiOperation(value = "通过名字查询", notes = "注意事项")
    @ApiImplicitParam(name = "name", value = "名字", required = false, dataType = "String")
    @PostMapping("/getByName")
    public List<Tuser> getByName(@RequestParam("name") String name) {
        System.out.println("name:" + name);
        List<Tuser> list = new ArrayList<Tuser>();
        return list;
    }

    //@ApiOperation：描述一个类的一个方法，或者说一个接口
    //@ApiImplicitParams：多个请求参数
    @ApiOperation(value = "通过名字和年龄查询", notes = "注意事项")
    @ApiImplicitParams({
            @ApiImplicitParam(name = "name", value = "名字", required = true, dataType = "String"),
            @ApiImplicitParam(name = "age", value = "年龄", required = false, dataType = "Integer")
    })
    @PostMapping("/getByNameAge")
    public List<Tuser> getByNameAge(String name, Integer age) {
        System.out.println("name:" + name + ",age:" + age);
        List<Tuser> list = new ArrayList<Tuser>();
        return list;
    }

    @ApiOperation(value = "添加tuser", notes = "注意事项")
    @PostMapping("/addTuser")
    public String addTuser(Tuser tuser) {
        return "添加成功！";
    }

    //不能添加@ApiImplicitParam注解
    @ApiOperation(value = "批量添加tuser", notes = "注意事项")
    @PostMapping("/addTuserList")
    public String addTuserList(@RequestBody List<Tuser> list) {
        for (Tuser tuser : list) {
            System.out.println("name:" + tuser.getName());
        }
        return "添加成功！";
    }
}
