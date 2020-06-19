package com.example.demo;


import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;

@FeignClient(name="Logging" ,url="http://localhost:9091/")
public interface ExternalServiceConnection {

    @GetMapping("/order")
    public String order();

}
