package com.springcloud.config_client_test.Controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RefreshScope // curl -X POST http://localhost:8081/actuator/refresh
public class HelloController {

    @Autowired
    private Environment environment;

    @Value("${springcloud.hello}")
    private String hello;

    @GetMapping("/hello")
    public String hello(@RequestParam String name) {
        return hello + "; " + environment.getProperty(name);
    }
}
