package com.example.employeeregisterationproject.controller;

import com.example.employeeregisterationproject.bootstrap.DataGenerator;
import com.example.employeeregisterationproject.model.Employee;
import lombok.Data;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
@RequestMapping("/employee")
public class EmployeeController {

    @GetMapping("/register")
    public String createUser(Model model) {
        model.addAttribute("employee", new Employee());
        model.addAttribute("states", DataGenerator.getAllStates());
        return "/employee/create-employee";
    }

}
