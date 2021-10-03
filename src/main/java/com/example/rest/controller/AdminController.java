package com.example.rest.controller;

import com.example.rest.model.User;
import com.example.rest.service.UserService;
import com.example.rest.service.UserServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class AdminController {

    private final UserService userService;

    @Autowired
    public AdminController(UserServiceImpl userService) {
        this.userService = userService;
    }

    @GetMapping("/admin")
    public String adminPage(Model model, Principal principal) {
        User user = userService.getUserByName(principal.getName());
        model.addAttribute("user", userService.getUserById(user.getId()));
        return "admin";
    }

}
