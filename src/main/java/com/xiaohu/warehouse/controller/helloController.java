package com.xiaohu.warehouse.controller;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/controller")
@ComponentScan(basePackages = "com.xiaohu.*")
public class helloController {

    @RequestMapping("/hello")
    public String hello(){
        return "hello spring boot!";
    }

}
