package com.springcloud.hystrixdashboard_test.Remote;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Component
@FeignClient(name = "producer", fallback = HelloRemoteFallBack.class)
public interface HelloRemote {
    @GetMapping("/hello")
    String hello(@RequestParam("name") String name);
}
