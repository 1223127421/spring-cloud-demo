package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class EurekaClientApplication {

    //测试效果
    //eureka-client开启两个实例（端口8762、8763），在调用时可以轮流访问这两个实例
    //测试方法：http://localhost:8764/hi,  http://localhost:8764/testRibbon

    public static void main(String[] args) {
        SpringApplication.run(EurekaClientApplication.class, args);
    }
}
