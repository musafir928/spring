package com.adil.controller;

import com.adil.bootstrap.DataGenerator;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/student")
public class StudentController {
    @RequestMapping("/register")
    public String register(Model model, @RequestParam(defaultValue = "unknown", required = false) String teacher) {
        model.addAttribute("students", DataGenerator.createStudent());
        model.addAttribute("teacher", teacher);
        return "student/register";
    }

    @RequestMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("students", DataGenerator.createStudent());
        return "student/welcome";
    }
}
