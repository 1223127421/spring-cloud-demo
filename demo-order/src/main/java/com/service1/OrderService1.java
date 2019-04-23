package com.service1;

import com.common.CommonEventPublisher;
import com.dao.OrderDao;
import com.entity.Order;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.context.ApplicationEventPublisherAware;
import org.springframework.scheduling.annotation.Async;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 14:17
 * @Version 1.0
 * @Describe
 */
@Service
public class OrderService1{

    @Autowired
    private OrderDao orderDao;

    @Autowired
    private CommonEventPublisher commonEventPublisher;

    @Async
    @Transactional
    public void insert(Order order) {
        orderDao.insert(order);
        System.out.println("OrderService1开始发送消息");
        commonEventPublisher.pushMsg(new AddOrder2Event(order));
    }

}
