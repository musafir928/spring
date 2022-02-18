package com.example;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class GarageApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigCar.class);
        Car c = container.getBean(Car.class);
        Person p = container.getBean(Person.class);
        p.setCar(c);

        System.out.println("Name: " + p.getName());
        System.out.println("Car make: " + p.getCar().getMake());
    }

}
