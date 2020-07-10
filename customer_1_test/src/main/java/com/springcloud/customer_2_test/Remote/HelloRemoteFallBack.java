package com.springcloud.customer_2_test.Remote;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class HelloRemoteFallBack implements HelloRemote {
    @Override
    public String hello(@RequestParam("name") String name) {
        return "fallback " + name + "!";
    }
}
