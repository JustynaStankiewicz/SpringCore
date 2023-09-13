package com.springboot.demo.springcoredemo.rest;

import com.springboot.demo.springcoredemo.common.Coach;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
//endpoints

@RestController
public class DemoController {
    private Coach myCoach;

    //constructor for dependency injection
    @Autowired
    public DemoController(@Qualifier("balletCoach") Coach theCoach){
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach=theCoach;
    }

    /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyFortune();
    }
}
