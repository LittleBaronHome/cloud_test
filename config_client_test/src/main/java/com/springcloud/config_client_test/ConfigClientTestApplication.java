package com.springcloud.config_client_test;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableEurekaClient
public class ConfigClientTestApplication {

    public static void main(String[] args) {
        SpringApplication.run(ConfigClientTestApplication.class, args);
    }

}
