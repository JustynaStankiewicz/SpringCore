package com.springboot.demo.myapp.rest;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//endpoints

@RestController
public class FunRestController {
    @GetMapping("/hello")
    public String sayHello(){
        return "Hello World!";
    }

    @GetMapping("/fortune")
    public String getDailyFortune(){
        return "You will find some happiness today.";
    }
}
