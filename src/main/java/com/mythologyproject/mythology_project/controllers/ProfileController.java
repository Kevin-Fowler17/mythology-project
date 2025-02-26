package com.mythologyproject.mythology_project.controllers;

import lombok.AllArgsConstructor;
import com.mythologyproject.mythology_project.models.User;
import com.mythologyproject.mythology_project.repositories.*;
import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@AllArgsConstructor
@Controller
public class ProfileController {

    private final UserRepository userDao;

    @GetMapping("/user")
    public String showProfileForm(Model model) {

        User loggedInUser = (User) SecurityContextHolder.getContext().getAuthentication().getPrincipal();

        if (loggedInUser == null) {
            return "/login";
        }

        User user = userDao.getReferenceById(loggedInUser.getId());

        model.addAttribute("user", user);

        return "users/profile";
    }

}
