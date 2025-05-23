package org.amazon.example.controller;

import org.amazon.example.service.WelcomeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WelcomeController {

    private final WelcomeService welcomeService;

    @Autowired
    public WelcomeController(WelcomeService welcomeService) {
        this.welcomeService = welcomeService;
    }

    @GetMapping("/welcome")
    public String welcome(Model model) {
        model.addAttribute("message", welcomeService.getWelcomeMessage());
        return "welcome";
    }
}