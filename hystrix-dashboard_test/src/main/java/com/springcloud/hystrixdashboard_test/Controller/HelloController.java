package com.springcloud.hystrixdashboard_test.Controller;


import com.springcloud.hystrixdashboard_test.Remote.HelloRemote;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    HelloRemote helloRemote;

    @GetMapping("/hello/{name}")
    public String hello(@PathVariable("name") String name) {
        return helloRemote.hello(name);
    }
}
