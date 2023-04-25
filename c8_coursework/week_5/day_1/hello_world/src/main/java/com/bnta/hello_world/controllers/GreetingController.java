package com.bnta.hello_world.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {
    // need to configure it as a controller by adding the @RestController annotation above
    // then create mapping for controller (handles http requests) below - @GetMapping - returning a resource based on a request

    @GetMapping("/greeting")
    public String greeting(@RequestParam String name, @RequestParam Long age){
        return String.format("Hello %s, age: %s", name, age);
        // http://localhost:8080/greeting to access in browser
        // ports exist to give ability to develop and test applications on same port
        // to access updated http://localhost:8080/greeting?name=alfred&age=30
        // created first API
    }

}

