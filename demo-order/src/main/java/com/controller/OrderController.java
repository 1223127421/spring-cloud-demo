package com.controller;

import com.entity.Order;
import com.service.impl.OrderServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

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
    public String test() {
        return "test====";
    }

    @RequestMapping("/getAllList")
    public String getAllList() {
        List<Order> list=orderService.getAllList();
        return list.toString();
    }

    @GetMapping("/insert")
    public void insert(Order order) {
        orderService.insert(order);

    }
}
