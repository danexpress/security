package com.example.security.secuex1.controllers;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
// import org.springframework.web.bind.annotation.RequestParam;

@RestController
public class DemoController {

    @GetMapping("/hello")
    public String hello() {
        return "Hello!";
    }

}
