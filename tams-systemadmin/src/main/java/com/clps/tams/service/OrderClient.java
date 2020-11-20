package com.clps.tams.service;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

@FeignClient("tams-order")
public interface OrderClient {

    @RequestMapping("/hello/aa")
    String SayHello(String name);
}
