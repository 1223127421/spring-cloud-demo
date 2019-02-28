package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;

//@EnableHystrix注解，开启hystrix熔断器功能
@EnableHystrix
@SpringBootApplication
public class EurekaRibbonHystrixClientApplication {
    public static void main(String[] args) {
        SpringApplication.run(EurekaRibbonHystrixClientApplication.class, args);
    }
}
