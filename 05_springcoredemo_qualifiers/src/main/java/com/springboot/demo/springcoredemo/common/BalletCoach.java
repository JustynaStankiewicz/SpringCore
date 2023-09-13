package com.springboot.demo.springcoredemo.common;

import org.springframework.stereotype.Component;

@Component
public class BalletCoach implements Coach{

    @Override
    public String getDailyFortune() {
        return "Go Guuuurl!Spin! Spin! Spin! ";
    }
}

