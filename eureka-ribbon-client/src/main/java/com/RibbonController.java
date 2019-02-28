package com;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RibbonController {
    @Autowired
    private RibbonService ribbonService;

    @GetMapping("/hi")
    public String hi() {
        return ribbonService.hi();
    }

    @GetMapping("/hi2")
    public String hi2() {
        return ribbonService.hi();
    }

    //    在Ribbon中的负载均衡客户端为LoadBalancerClient
    //    在spring cloud项目中，负载均衡器Ribbon会默认从Eureka Client 的服务注册列表中获取服务的信息，
    //    并缓存一份，根据缓存的信息，通过LoadBalancerClient来选择不同的服务实例，从而实现负载均衡
    @Autowired
    private LoadBalancerClient loadBalancerClient;

    @GetMapping("/testRibbon")
    public String testRibbon() {
        ServiceInstance serviceInstance = loadBalancerClient.choose("eureka-client");
        return "url:" + serviceInstance.getHost() + ",端口号：" + serviceInstance.getPort();
    }

}
