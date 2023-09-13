package com.springboot.demo.springcoredemo.common;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
public class BalletCoach implements Coach{
    public BalletCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyFortune() {
        return "Go Guuuurl!Spin! Spin! Spin! ";
    }
}

