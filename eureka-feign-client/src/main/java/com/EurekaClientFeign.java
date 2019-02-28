package com;

import org.springframework.cloud.openfeign.EnableFeignClients;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "eureka-client", configuration = FeignConfig.class)
public interface EurekaClientFeign {

    //    该方法通过Feign来调用eureka-client服务的“/hi”的api接口
    @GetMapping("/hi")
    String sayHiFromClientEureka();
}
