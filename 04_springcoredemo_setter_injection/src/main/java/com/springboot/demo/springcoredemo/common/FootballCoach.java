package com.springboot.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class FootballCoach implements Coach {

    @Override
    public String getDailyWorkout() {
        return "Run 7 yards!!!!!";
    }
}
