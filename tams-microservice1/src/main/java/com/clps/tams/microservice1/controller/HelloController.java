package com.clps.tams.microservice1.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/hello")
@RefreshScope
public class HelloController {

    @Value("${infra.name}")
    String name;
    @Value("${infra.age}")
    String age;

    @RequestMapping("/say")
    public String SayHello(){
        return "Hello "+ name+","+age;
    }


}
