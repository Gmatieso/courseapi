package com.example.courseapi.topic.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController   // Maps this class as a REST controller
public class HelloController {
    /*
    The @ReauestMapping maps only to the GET method by default
     */
    @RequestMapping("/hello")  //execute this method whenever there's a request to /hello
    public  String sayHi() {
        return  "Hi";
    }
}
