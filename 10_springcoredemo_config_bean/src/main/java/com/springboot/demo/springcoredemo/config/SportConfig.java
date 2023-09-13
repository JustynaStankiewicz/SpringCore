package com.springboot.demo.springcoredemo.config;

import com.springboot.demo.springcoredemo.common.Coach;
import com.springboot.demo.springcoredemo.common.SwimCoach;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class SportConfig {

    @Bean
    public Coach swimCoach(){
        return  new SwimCoach();
    }
}
