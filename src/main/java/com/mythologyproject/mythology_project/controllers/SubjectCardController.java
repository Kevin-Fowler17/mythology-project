package com.mythologyproject.mythology_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectCardController {

    @GetMapping("/about-me")
    public String showAboutForm(){
        return "about-me";
    }

}
