package com.common;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationEvent;
import org.springframework.context.ApplicationEventPublisher;
import org.springframework.stereotype.Service;

/**
 * @Author: wangzhuyi
 * @Date: 2019/4/15 16:28
 * @Version 1.0
 * @Describe
 */
@Service
public class CommonEventPublisher {

    @Autowired
    private ApplicationEventPublisher applicationEventPublisher;

    //发送消息
    public void pushMsg(ApplicationEvent applicationEvent) {
        System.out.println("CommonEventPublisher开始发送消息========："+applicationEvent);
        applicationEventPublisher.publishEvent(applicationEvent);
    }
}
