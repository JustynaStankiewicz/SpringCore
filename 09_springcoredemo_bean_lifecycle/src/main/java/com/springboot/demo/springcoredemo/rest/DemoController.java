package com.springboot.demo.springcoredemo.rest;

import com.springboot.demo.springcoredemo.common.Coach;
import jakarta.annotation.PostConstruct;
import jakarta.annotation.PreDestroy;
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
    public DemoController(@Qualifier("balletCoach") Coach theCoach) {
        System.out.println("In constructor: " + getClass().getSimpleName());
        myCoach = theCoach;
    }

    //define init method
    @PostConstruct
    public void doMyStartupStuff() {
        System.out.println("In doMyStartupStuff(): " + getClass().getSimpleName());
    }

    //define destroy method
    @PreDestroy
    public void doMyCleanupStuff() {
        System.out.println("In doMyCleanupStuff(): " + getClass().getSimpleName());
    }

    /* @Autowired
    public void setCoach(Coach theCoach){
        myCoach=theCoach;
    }*/

    @GetMapping("/dailyworkout")
    public String getDailyWorkout() {
        return myCoach.getDailyFortune();
    }

   /* @GetMapping("/check")
    public String check(){

        return "Comparing beans: "+ (myCoach==anotherCoach);
    }
*/
}
