package com.mukisa.tea.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class testController {

    @GetMapping("/")
    public String testCon(){
        return "test";
    }

    @GetMapping("/login")
    public String login(){
        return "login.html";
    }

    @GetMapping("/logout")
    public String logout(){
        return "logout.html";
    }

}
