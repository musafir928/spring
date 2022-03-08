package com.example.controller;

import com.example.model.Gender;
import com.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;
import java.util.Random;

@Controller
public class StudentController {
    @RequestMapping("/welcome")
    public String homePage(Model model) {
        model.addAttribute("name", "adil");
        model.addAttribute("course", "MVC");
        Random random = new Random();
        model.addAttribute(
                "studentIds",
                Arrays.asList(random.nextInt(), random.nextInt(), random.nextInt(), random.nextInt())
        );


        return "student/welcome";
    }
}
