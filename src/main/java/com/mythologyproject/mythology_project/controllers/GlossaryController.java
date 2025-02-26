package com.mythologyproject.mythology_project.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class GlossaryController {

    @GetMapping("/glossary")
    public String showAboutForm(){
        return "glossary";
    }

}
