package com.worker.demo.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.scheduling.support.SimpleTriggerContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author 郝少杰
 * @date 2021/1/9 16:38
 */
@RestController
@RequestMapping("/apollo")
public class TestController {

    @Value("${name}")
    private String name;

    @RequestMapping("/name")
    public String testApollo(){
        return name;
    }
}
