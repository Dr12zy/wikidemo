package com.jiawa.wiki.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Map;

@RestController

public class TestController {
@RequestMapping("/hello")
    public String hello() {

        return "Hello world";
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
