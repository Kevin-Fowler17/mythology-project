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

        characters.forEach(character -> {
            System.out.println("*****************");
            if (character.getAntagonists() != null) {
                System.out.println(character.getAntagonists());
            } else {
                System.out.println("No antagonists found.");
            }
            System.out.println("*****************");
        });

        characters.forEach(character -> {
            System.out.println("+++++++++++++++++");
            System.out.println("Character: " + character.getName());
            System.out.println("Antagonists: " + (character.getAntagonists() == null ? "None" : character.getAntagonists()));
            System.out.println("+++++++++++++++++");

        });



//        System.out.println(characters);

        return "glossary";

    }

}
