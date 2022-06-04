package com.cydeo.bean_annotation;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Primary;

@Configuration
public class ConfigMain {

    @Bean
    @Primary
    FullTimeMentor fullTimeMentor() {
        return new FullTimeMentor();
    }

    @Bean
    FullTimeMentor fullTimeMentor2() {
        return new FullTimeMentor();
    }

    @Bean(name = "pm1")
    PartTimeMentor partTimeMentor() {
        return new PartTimeMentor();
    }

    @Bean(name = "pm2")
    PartTimeMentor partTimeMentor2() {
        return new PartTimeMentor();
    }
}
