package com;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableAsync;

/**
 * @Author: wangzhuyi
 * @Date: 2019/3/5 10:05
 * @Describe
 */
@EnableAsync
@SpringBootApplication
public class DemoOrderApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoOrderApplication.class, args);
    }
}
