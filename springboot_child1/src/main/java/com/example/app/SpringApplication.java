package com.example.app;

import com.example.controller.SpringController;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

//@EnableAutoConfiguration
//@ComponentScan("com.example.controller")
// 默认情况下扫描包和其子包,所以要另外指定包名
@SpringBootApplication(scanBasePackages = {"com.example.controller"}) // 组合注解
public class SpringApplication {
    public static void main(String[] args) {
        org.springframework.boot.SpringApplication.run(SpringApplication.class, args);
    }
}
