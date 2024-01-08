// LoginController.java
// LoginController.java
package com.example.demo.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.example.demo.Service.LoginService;  // 修正
import com.example.demo.form.Loginform;

@Controller
public class LoginController {

    private final LoginService loginService;

    public LoginController(LoginService loginService) {
        this.loginService = loginService;
    }

    @GetMapping("/login")
    public String view(Model model, Loginform form) {
        return "login";
    }

    @PostMapping("/login")
    public String login(Model model, Loginform form) {
        System.out.println("Login method called.");
        if (loginService.authenticateUser(form.getUser_id(), form.getPassword())) {
            System.out.println("Authentication successful.");
            return "redirect:/menu";
        } else {
            System.out.println("Authentication failed.");
            model.addAttribute("errorMsg", "ログインIDとパスワードの組み合わせが間違っています。");
            return "login";
        }
    }
}

