package com.springboot.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
/*@Primary*/
public class BasketballCoach implements Coach {
    public BasketballCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyFortune() {
        return "You are not high enough! JUMP";
    }
}
