package com.example;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigCar {
    @Bean
    Car car() {
        Car c = new Car();
        c.setMake("Toyota");
        return c;
    }

    // direct wiring
    //    @Bean
    //    Person person() {
    //        Person p = new Person();
    //        p.setCar(car());
    //        p.setName("Tom");
    //        return p;
    //    }

    // auto wiring
    @Bean
    Person person(Car car) {
        Person p = new Person();
        p.setCar(car);
        p.setName("Jerry");
        return p;
    }


    // Note: Wiring has two types: wiring(direct wiring and auto wiring)
    // wiring (direct wiring call the another method inside the method)
    // use existed method output as class member

}
