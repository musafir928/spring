package com.cydeo.bean_annotation;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class CydeoApp {
    public static void main(String[] args) {
        ApplicationContext container = new AnnotationConfigApplicationContext(ConfigMain.class, ConfigTest.class);
        FullTimeMentor ft = container.getBean(FullTimeMentor.class);
        ft.createAccount();
        PartTimeMentor pt = container.getBean("pm1",PartTimeMentor.class);
        pt.createAccount();

        String sb = container.getBean(String.class);
        System.out.println(sb);
    }
}
