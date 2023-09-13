package com.springboot.demo.springcoredemo.common;

public class SwimCoach implements Coach {

    public SwimCoach() {
        System.out.println("In constructor: " + getClass().getSimpleName());
    }

    @Override
    public String getDailyFortune() {
        return "Swim like a fish!";
    }
}
