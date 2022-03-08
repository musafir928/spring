package com.example.controller;

import com.example.model.Gender;
import com.example.model.Student;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Arrays;
import java.util.List;

@Controller
public class StudentsController {
    @RequestMapping("/students")
    public String index(Model model) {
        // student object
        List<Student> students = Arrays.asList(
                new Student(1,"Adil", "Ablimit", 35, Gender.MALE),
                new Student(2,"Asiye", "Adil", 10, Gender.FEMALE),
                new Student(3,"Maryam", "Adil", 8, Gender.FEMALE),
                new Student(4,"Hediche", "Adil", 5, Gender.FEMALE)
        );
        model.addAttribute("students", students);


        return "/student/list";
    }
}
