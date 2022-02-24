package com.adil.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "com.adil")
// @ComponentScan(basePackages = {"com.adil.proxy", "com.adil.service", "com.adil.repository"})
public class ProjectConfig {
}

// note: we didn't put model package to the packages going to be scanned
// cuz, the rule is: if the class is a dependency injected somewhere, or it has
// some dependencies then we trade it as a component
// POJO classes we don't put @Component annotation
