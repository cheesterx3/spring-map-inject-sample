package com.example.mapinjectexample.component;

import org.springframework.stereotype.Component;

@Component
public class Car implements Drivable {
    @Override
    public void drive() {
        System.out.println("Brrrrr....");
    }
}
