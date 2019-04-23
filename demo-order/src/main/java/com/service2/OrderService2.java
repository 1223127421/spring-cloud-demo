package com.service2;

import com.dao.Order2Dao;
import com.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.scheduling.annotation.AsyncResult;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.concurrent.Future;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 14:17
 * @Version 1.0
 * @Describe
 */
@Service
public class OrderService2 {

    @Autowired
    private Order2Dao order2Dao;

    //    @Transactional
    public void insert(Order order) {
        order2Dao.insert(order);
        int a = 1 / 0;
    }

    @Async
    @Transactional
    public Future<String> insert2(Order order) {
        System.out.println("2");
        order2Dao.insert(order);
        int a = 1 / 0;
        System.out.println("22");
        return new AsyncResult<>("aaaaa");
    }
}
