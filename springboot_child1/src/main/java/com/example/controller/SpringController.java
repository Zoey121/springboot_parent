package com.example.controller;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

//如果每个功能返回的都是Restful,则可以使用该注解
@RestController
public class SpringController {

    @RequestMapping("/hello")
    // 说明返回Restful内容,不使用则会进行跳转
//    @ResponseBody
    public String yes() {
        return "hello";
    }

    @RequestMapping("/ok")
//    @ResponseBody
    public String ok() {
        return "ok";
    }

    // 支持Rest风格
    @RequestMapping("/info/{msg}")
    public String show(@PathVariable String msg) {
        return "show " + msg;
    }
}
