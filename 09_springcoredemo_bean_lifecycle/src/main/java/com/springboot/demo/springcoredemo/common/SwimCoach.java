package com.springboot.demo.springcoredemo.common;

public class SwimCoach implements Coach{

    @Override
    public String getDailyFortune() {
        return "Swim like a fish!";
    }
}
