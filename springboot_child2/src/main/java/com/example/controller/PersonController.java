package com.example.controller;

import com.example.pojo.Person;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.Date;

@Controller
public class PersonController {

    @RequestMapping("/person")
    @ResponseBody
    public Object show() {
        Person person = new Person();
        person.setId(66);
        person.setName("赵柳");
        person.setDate(new Date());
        return person;
    }
}
