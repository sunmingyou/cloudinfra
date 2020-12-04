package com.clps.tams.microservice2.controller;

import com.clps.tams.microservice2.service.OrderClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
public class HelloController {

    @Autowired
    OrderClient orderClient;

    @Value("${infra.name}")
    String name;
    @Value("${infra.age}")
    String age;

    @RequestMapping("/say")
    public String SayHello(){
        return "Hello "+ name+","+age;
    }

}
