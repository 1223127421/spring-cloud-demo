package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class RibbonService {
    @Autowired
    RestTemplate restTemplate;

    public String hi() {
        // 只需写服务名称eureka-client，不用硬编码
        // hi是eureka-client中 HiController中的路径@GetMapping("/hi")
        return restTemplate.getForObject("http://eureka-client/hi", String.class);
    }
}
