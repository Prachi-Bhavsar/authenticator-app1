package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.AuthorEntity;

@Controller
public class LoginauthenticatorController {

    // Root URL - show homepage
    @GetMapping("/")
    public String homePage() {
        return "Homepage"; // Change this to your actual home view name
    }

    @GetMapping("/loginpage")
    public String showLoginPage() {
        return "loginauth";
    }

    @GetMapping("/registerpage")
    public String showRegistrationPage() {
        return "register"; // This should match your register.jsp or register.html
    }

    @PostMapping("/register")
    public String registration(String fullname, String Attendence) {
        return "loginauth";
    }

    @PostMapping("/Saveauthor")
    public String saveauthor(AuthorEntity authentity) {
        System.out.println(authentity.getFullname());
        System.out.println(authentity.getEmail());
        System.out.println(authentity.getUsername());
        System.out.println(authentity.getPassword());
        return "Homepage";
    }
}
