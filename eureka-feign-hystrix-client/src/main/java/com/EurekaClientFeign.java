package com;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;

@Component
@FeignClient(value = "eureka-client", configuration = FeignConfig.class,fallback = HiHystrix.class)
public interface EurekaClientFeign {

    @GetMapping("/hi")
    String sayHiFromClientEureka();
}
