package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.form.Loginform;

@Controller
public class LoginController {
    private static final String LOGIN_ID = "user";
    private static final String PASSWORD = "pwd";
    
    @GetMapping("/login")
    public String view(Model model, Loginform form) {
        return "login";
    }
    
    @PostMapping("/login")
    public String login(Model model, Loginform form) {
        var isCorrectUserAuth = form.getLoginId().equals(LOGIN_ID) && form.getPassword().equals(PASSWORD);
        if (isCorrectUserAuth) {
            return "redirect:/menu";
        } else {
            model.addAttribute("errorMsg", "ログインIDとパスワードの組み合わせが間違っています。");
            return "login";
        }
    }
}

