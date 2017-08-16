package com.jason.controller;

import com.jason.common.result.ControllerResult;
import com.jason.common.result.Result;
import com.jason.model.Test;
import org.springframework.validation.BindingResult;
import org.springframework.validation.annotation.Validated;
import org.springframework.web.bind.annotation.*;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Jason on 2017/8/3.
 */
@RestController
@RequestMapping("hello")
public class HelloController {

    @GetMapping("say")
    public Result say() {
        String hello = "hello , world !";
        System.out.println(hello);
        return ControllerResult.init(hello);
    }

    @PostMapping("said")
    public Result said(@RequestParam String user, @RequestParam String content) {
        Map<String, String> map = new HashMap<String, String>();
        map.put(user, content);
        return ControllerResult.init(map);
    }

    @GetMapping("speak/{user}")
    public Result said(@PathVariable String user) {
        String msg = user + "正筹备一个项目!";
        return ControllerResult.init(msg);
    }

    @GetMapping("valid")
    public Result said(@Validated(Test.ValidName.class) Test test, BindingResult bindingResult) {
        return ControllerResult.init(null);
    }
}
