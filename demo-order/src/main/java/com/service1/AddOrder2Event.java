package com.service1;

import com.entity.Order;
import org.springframework.context.ApplicationEvent;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 14:20
 * @Version 1.0
 * @Describe
 */
public class AddOrder2Event extends ApplicationEvent {

    public AddOrder2Event(Order order) {
        super(order);
    }
}
