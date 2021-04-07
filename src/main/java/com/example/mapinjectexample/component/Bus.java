package com.example.mapinjectexample.component;

import org.springframework.stereotype.Component;

@Component
public class Bus implements Drivable {
    @Override
    public void drive() {
        System.out.println("Doors are closing!!!");
    }
}
