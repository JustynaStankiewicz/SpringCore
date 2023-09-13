package com.springboot.demo.springcoredemo.common;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class BalletCoach implements Coach{
    public BalletCoach(){
        System.out.println("In constructor: "+ getClass().getSimpleName() );
    }
    @Override
    public String getDailyFortune() {
        return "Go Guuuurl!Spin! Spin! Spin! ";
    }
}

