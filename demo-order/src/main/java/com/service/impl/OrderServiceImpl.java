package com.service.impl;

import com.dao.OrderDao;
import com.entity.Order;
import com.service.OrderService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/5 10:25
 * @Describe
 */
@Service
public class OrderServiceImpl implements OrderService {

    @Autowired
    private OrderDao orderDao;

    @Override
    public List<Order> getAllList() {
        return orderDao.getAllList();
    }
}
