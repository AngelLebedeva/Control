package com.example.demo.Controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

    @RestController
    public class DemoController {

        @GetMapping("/hello")
        public String getHelloMessage(){
            return "Hello Spring Boot.";
        }
    }

