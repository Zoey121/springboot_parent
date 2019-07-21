package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class ExceptionController {

    @RequestMapping("/exception")
    @ResponseBody
    public String exception() {
        int[] a = new int[3];
        System.out.println(a[3]);
        return "exception";
    }
}
