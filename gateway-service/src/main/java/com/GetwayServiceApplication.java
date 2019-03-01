package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@SpringBootApplication
public class GetwayServiceApplication {
    public static void main(String[] args) {
        SpringApplication.run(GetwayServiceApplication.class,args);
    }
}
