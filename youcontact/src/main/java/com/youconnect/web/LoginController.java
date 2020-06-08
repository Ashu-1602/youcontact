package com.youconnect.web;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

import com.youconnect.entities.User;
import com.youconnect.security.Authority;
import com.youconnect.service.UserService;

@Controller
public class LoginController {

	@Autowired
	UserService userService;
	
	@GetMapping("/login")
	public String login() {
		return "login";
	}
	
	@GetMapping("/register")
	public String register(ModelMap model) {
		model.put("user", new User());
		return "register";
	}
	
	@PostMapping("/register")
	public String registerPost(User user) {
		userService.save(user);
		return "redirect:/login";
	}
}
