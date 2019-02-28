package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Date;

@RestController
public class HiController {

    //    获取配置文件中的参数
    @Value("${server.port}")
    String port;

    @GetMapping("/hi")
    public String Home() {
        return "[eureka-client] HiController 端口号：" + port+",现在时间："+new Date();
    }
}