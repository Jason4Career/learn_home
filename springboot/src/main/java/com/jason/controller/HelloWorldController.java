package com.jason.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Jason on 2017/8/2.
 */
@RestController
@RequestMapping("hello")
public class HelloWorldController {


    @Value("${tests}")
    private String test;

    @GetMapping(value = {"say","speak"})
    public String say(){
        return test;
//        return "HelloWorld,Spring-Boot";
    }
}
