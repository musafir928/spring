package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class ConfigTest {

    @Bean
    String s() {
        return "Developer";
    }

    @Bean
    Integer i() {
        return 120;
    }
}
