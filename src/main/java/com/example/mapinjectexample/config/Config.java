package com.example.mapinjectexample.config;

import com.example.mapinjectexample.component.Drivable;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.Map;

@Configuration
public class Config {
    @Bean
    Object objectWithMap(Map<String, Drivable> drivableMap){
        System.out.println(drivableMap);
        return new Object();
    }
}
