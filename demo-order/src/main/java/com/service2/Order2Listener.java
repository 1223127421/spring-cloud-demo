package com.service2;

import com.entity.Order;
import com.service1.AddOrder2Event;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.event.EventListener;
import org.springframework.stereotype.Component;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 16:21
 * @Version 1.0
 * @Describe
 */
@Component
public class Order2Listener {

    @Autowired
    private OrderService2 orderService2;

    @EventListener
    public void addOrder2(AddOrder2Event addOrder2Event) {
        System.out.println("Order2Listener接收的消息是：" + addOrder2Event.getSource());
        Order order = (Order) addOrder2Event.getSource();
        orderService2.insert(order);
    }
}
