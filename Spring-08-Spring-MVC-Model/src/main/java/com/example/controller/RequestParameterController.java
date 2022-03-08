package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
@RequestMapping("/car")
public class RequestParameterController {
    @RequestMapping("/info")     //localhost:8080/car/info?make=Toyota
    public String catInfo(@RequestParam String make, Model model) {
        model.addAttribute("make", make);
        return "car/car-info";
    }

    @RequestMapping("/info2")     //localhost:8080/car/info?make=Toyota
    public String catInfo2(@RequestParam(defaultValue = "unknown", required = false) String make, Model model) {
        model.addAttribute("make", make);
        return "car/car-info";
    }
}
