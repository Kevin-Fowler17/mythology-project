package com.mythologyproject.mythology_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class SubjectCardController {

    @GetMapping("/subject-card")
    public String showAboutForm(){
        return "subject-card";
    }

}
