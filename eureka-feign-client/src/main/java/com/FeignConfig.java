package com;

import ch.qos.logback.core.util.TimeUtil;
import feign.Retryer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.concurrent.TimeUnit;

@Configuration
public class FeignConfig {

    //    注入一个BeanName为feignRetryer的Retryer的Bean。可使feign在远程调用失败后会进行重试。
    @Bean
    public Retryer feingRetryer() {
        return new Retryer.Default(100, TimeUnit.SECONDS.toMillis(1), 5);
    }
}
