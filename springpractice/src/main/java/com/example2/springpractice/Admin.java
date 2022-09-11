package com.example2.springpractice;

import org.springframework.beans.factory.annotation.Configurable;
import org.springframework.context.annotation.Bean;

@Configurable
public class Admin {

    @Bean
    public Point getPointObj() {
        return new Point();
    }

}
