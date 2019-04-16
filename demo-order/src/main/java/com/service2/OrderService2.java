package com.service2;

import com.dao.OrderDao;
import com.entity.Order;
import com.service1.AddOrder2Event;
import com.sun.tools.corba.se.idl.constExpr.Or;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationListener;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 14:17
 * @Version 1.0
 * @Describe
 */
@Service
public class OrderService2 {

    @Autowired
    private OrderDao orderDao;

    @Transactional
    public void insert(Order order) {
        orderDao.insert(order);
    }

}
