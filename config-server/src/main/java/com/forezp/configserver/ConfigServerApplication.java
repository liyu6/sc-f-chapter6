package com.forezp.configserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer//注解开启配置服务器的功能
@EnableEurekaClient
public class ConfigServerApplication {

    //配置服务中心可以从远程程序获取配置信息
    public static void main(String[] args) {
        SpringApplication.run(ConfigServerApplication.class, args);
    }
}
