package com.example;

import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
@AllArgsConstructor
public class Java {

    // filed injection
    //    @Autowired
    //    OfficeHours officeHours;

    // Constructor injection
    OfficeHours officeHours;
    // @Autowired  if we have a constructor, we can omit this annotation
    // so, we can also use lombok
//    public Java(OfficeHours officeHours) {
//        this.officeHours = officeHours;
//    }

    public void getTeachingHours() {

        System.out.println("weekly teaching hours: " + (20 + officeHours.getHours()));
    }
}
