package com.adil.controller;

import com.adil.model.Mentor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.Arrays;

@Controller
@RequestMapping("/mentor")
public class MentorController {
    @GetMapping("/register")
    public String showForm(Model model) {
        model.addAttribute("batchList", Arrays.asList("JD1", "JD2", "EU1", "EU2", "B18", "B20"));
        model.addAttribute("mentor", new Mentor());
        return "mentor/mentor-register";
    }

    @PostMapping("/register")
    public String registerUser(@ModelAttribute("mentor") Mentor mentor, Model model) {
//        model.addAttribute("mentor", mentor);
        return "redirect:/mentor/register";
//        return "mentor/mentor-creation";
    }
}
