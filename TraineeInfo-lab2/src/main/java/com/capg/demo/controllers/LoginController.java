package com.capg.demo.controllers;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.ModelAndView;

import com.capg.demo.models.User;

@Controller
public class LoginController {

	@GetMapping("/")
	public String showLoginPage()
	{
			return "loginPage";
	}
	
	@PostMapping("/login")
	public String showManagementPage(@RequestParam("username") String userName,
			@RequestParam("password") String passWord)
	{
		if(userName.equals("admin") && passWord.equals("password"))
	    	return "traineeManagementPage";
		else
			return "404NotFound";
	}
    
}
