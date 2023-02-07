package com.example.hello.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/get")
public class GetApiController {

    @GetMapping(path = "/hello") // http://localhost:8080/api/get/hello
    public String hello(){
        return "get hello";
    }

    @RequestMapping(path = "/hi", method = RequestMethod.GET) // http://localhost:8080/api/get/hi
    public String hi(){
        return "get hi";
    }
}
