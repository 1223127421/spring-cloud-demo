package com;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MyController {

    @Value("${foo}")
    String foo;

    @RequestMapping("/foo")
    public String hi() {
        return "读取配置文件中的属性："+foo;
    }
}
