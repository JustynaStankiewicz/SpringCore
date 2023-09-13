package com.springboot.demo.springcoredemo.rest;

import com.springboot.demo.springcoredemo.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//endpoints

@RestController
public class DemoController {
    private Coach myCoach;

    //    constructor for dependency injection
    @Autowired
    public DemoController(Coach theCoach) {
        myCoach = theCoach;
    }

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyWorkout();
    }
}
