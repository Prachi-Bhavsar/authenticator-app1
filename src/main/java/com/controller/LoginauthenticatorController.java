package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.entity.AuthorEntity;

@Controller
public class LoginauthenticatorController 
{
	@GetMapping("/loginpage")
    public String showLoginPage() {
        return "loginauth"; 
    }
	
	@GetMapping("registration")
	public String showRegistration()
	{
		return "register";
	}
	
	@PostMapping("register")
	public String registration(String fullname,String Attendence)
	{
		return "loginauth";
	}
	
	@PostMapping("Saveauthor")
	public String saveauthor(AuthorEntity authentity)
	{
		System.out.println(authentity.getFullname());
		System.out.println(authentity.getEmail());
		System.out.println(authentity.getUsername());
		System.out.println(authentity.getPassword());
		return "Homepage";
	}
	
}
