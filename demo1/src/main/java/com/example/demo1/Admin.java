package com.example.demo1;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;

@Configuration
public class Admin {

    @Bean
    @Scope("prototype")
    public Point getPointObj() {
        
        return new Point(2, 3);
    }

    @Bean
    public Point getPointObj2() {

        return new Point(6, 7);
    }
}
