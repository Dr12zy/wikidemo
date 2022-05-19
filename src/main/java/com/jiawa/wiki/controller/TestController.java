package com.jiawa.wiki.controller;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController

public class TestController {
    @Value("${test.hello:TEST}")
    private String testHello;


@GetMapping("/hello")
    public String hello() {

        return "Hello world " + testHello;
    }

    @RequestMapping("/hello/post")
    public String helloPost(String name) {

        return "Hello world! Post, " + name;
    }

//@PostMapping("/hello/post")
//public String helloPost() {
//
//    return "Hello world! Post, " + map.get("name");
//}

}
