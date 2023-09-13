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
    private Coach anotherCoach;

    //constructor for dependency injection
    @Autowired
    public DemoController(
            @Qualifier("balletCoach") Coach theCoach,
            @Qualifier("balletCoach") Coach theAnotherCoach){
        System.out.println("In constructor: "+getClass().getSimpleName());
        myCoach=theCoach;
        anotherCoach=theAnotherCoach;
    }


    /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout(){
        return myCoach.getDailyFortune();
    }

    @GetMapping("/check")
    public String check(){

        return "Comparing beans: "+ (myCoach==anotherCoach);
    }

}
