package com.jason;

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

    @Value("{$tests}")
    private String test;

    @GetMapping("say")
    public String say(){
        System.out.println(test);
        return test;
//        return "HelloWorld,Spring-Boot";
    }
}
