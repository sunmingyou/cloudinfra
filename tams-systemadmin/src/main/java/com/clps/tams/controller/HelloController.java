package com.clps.tams.controller;

import com.clps.tams.service.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    OrderClient orderClient;

    @RequestMapping("/{name}")
    public String SayHello(@PathVariable String name){
        return orderClient.SayHello(name);
    }
}
