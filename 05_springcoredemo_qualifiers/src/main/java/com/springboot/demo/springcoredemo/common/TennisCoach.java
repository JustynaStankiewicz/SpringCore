package com.springboot.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class TennisCoach implements Coach {

    @Override
    public String getDailyFortune() {
        return "You must work on your backend!  ";
    }
}
