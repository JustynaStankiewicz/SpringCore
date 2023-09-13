package com.springboot.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BasketballCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return "You are not high enough! JUMP";
    }
}
