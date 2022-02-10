package com.translate.resttranslate.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController("/")
public class HelloController {

    @GetMapping("/hello")
    public String getHello() {
        return "Hello";
    }

    @RequestMapping("/")
    public String hello()
    {
        return "Hello Kapil";
    }
}
