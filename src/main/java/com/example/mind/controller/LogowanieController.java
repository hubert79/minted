package com.example.mind.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class LogowanieController {

    @GetMapping("/all/logowanie.html")
    public String showLoginPage(){

        return "all/logowanie";
    }
}
