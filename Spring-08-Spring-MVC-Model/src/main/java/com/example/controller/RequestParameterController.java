package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.websocket.server.PathParam;

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

    @RequestMapping("info3/{make}/{year}")
    public String carInfo3(@PathVariable String make, @PathVariable Integer year, Model model) {
        model.addAttribute("make", make);
        model.addAttribute("year", year);
        return "car/car-info";
    }
}
