package com.example.controller;

import org.apache.log4j.Logger;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class controller {
    private Logger logger = Logger.getLogger(this.getClass());

    @RequestMapping("/show")
    public String show() {
        logger.debug("debug日志");
        logger.info("info日志");
        logger.warn("warn日志.....");
        logger.error("error日志");
        return "show";
    }
}
