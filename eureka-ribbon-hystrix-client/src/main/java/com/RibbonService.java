package com;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    //    fallbackMethod为处理回退（fallback）逻辑的方法
    @HystrixCommand(fallbackMethod = "hiError")
    public String hi() {
        return restTemplate.getForObject("http://eureka-client/hi", String.class);
    }

    public String hiError() {
        return "启动熔断器，调用失败回滚方法！！！！！";
    }
}
