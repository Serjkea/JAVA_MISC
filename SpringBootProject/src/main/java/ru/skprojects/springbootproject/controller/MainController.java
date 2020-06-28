package ru.skprojects.springbootproject.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class MainController {

    @GetMapping("/")
    public String mainPage(Model model) {
        model.addAttribute("message","hello");
        return "index";
    }

    @PostMapping("/{id}")
    public String mainPage(@PathVariable("id") Long id, Model model) {
        model.addAttribute("");
        return "index";
    }

}
