package com;

import org.springframework.stereotype.Component;

@Component
public class HiHystrix implements  EurekaClientFeign{

    @Override
    public String sayHiFromClientEureka() {
        return "启动熔断器，调用回滚方法！！！！！！！";
    }
}
