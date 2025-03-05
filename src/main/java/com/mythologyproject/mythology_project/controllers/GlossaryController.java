package com.mythologyproject.mythology_project.controllers;

import com.mythologyproject.mythology_project.models.Character;
import com.mythologyproject.mythology_project.repositories.CharacterRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.*;

@AllArgsConstructor
@Controller
public class GlossaryController {

    private final CharacterRepository characterDao;

    @GetMapping("/glossary")
    public String showGlossary(Model model) {

        List<Character> characters = characterDao.findAll();

        model.addAttribute("characters", characters);

        return "glossary";

    }

}
