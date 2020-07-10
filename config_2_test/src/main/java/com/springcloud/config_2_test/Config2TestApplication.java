package com.springcloud.config_2_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.config.server.EnableConfigServer;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableConfigServer
@EnableEurekaClient
public class Config2TestApplication {

    public static void main(String[] args) {
        SpringApplication.run(Config2TestApplication.class, args);
    }

}
