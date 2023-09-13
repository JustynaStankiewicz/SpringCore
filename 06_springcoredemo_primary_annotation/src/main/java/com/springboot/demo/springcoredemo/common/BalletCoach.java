package com.springboot.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class BalletCoach implements Coach{

    @Override
    public String getDailyFortune() {
        return "Go Guuuurl!Spin! Spin! Spin! ";
    }
}

