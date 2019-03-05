package com.controller;

import com.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/5 10:19
 * @Describe
 */
@RestController
@RequestMapping("order")
public class OrderController {

    @Autowired
    private OrderServiceImpl orderService;

    @RequestMapping("test")
    public String test(){
        return "test====";
    }

    @RequestMapping("/getAllList")
    public String getAllList(){
        return orderService.getAllList().toString();
    }
}
