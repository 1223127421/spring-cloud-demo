package com.service.impl;

import com.dao.OrderDao;
import com.entity.Order;
import com.service.OrderService;
import com.service2.OrderService2;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/5 10:25
 * @Describe
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;
    @Autowired
    private OrderService2 orderService2;

    @Override
    public List<Order> getAllList() {
        return orderDao.getAllList();
    }

    @Transactional
    public void insert(Order order) {
        orderDao.insert(order);
        System.out.println("1");
        Future<String> future=orderService2.insert2(order);
        System.out.println("isCancelled:"+future.isCancelled());
        System.out.println("isDone:"+future.isDone());
        try {
            System.out.println("get:"+future.get());
        } catch (InterruptedException e) {
            e.printStackTrace();
        } catch (ExecutionException e) {
            e.printStackTrace();
        }
        System.out.println("3");
    }
}
