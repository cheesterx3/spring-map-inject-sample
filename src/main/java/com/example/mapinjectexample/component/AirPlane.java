package com.example.mapinjectexample.component;

import org.springframework.stereotype.Component;

@Component("ComponentWithName")
public class AirPlane implements Drivable {
    @Override
    public void drive() {
        System.out.println("We can fly!!!!");
    }
}
