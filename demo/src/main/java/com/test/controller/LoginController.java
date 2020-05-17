package com.test.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import com.test.dto.User;

@Controller
public class LoginController {
	@RequestMapping("/login")
	public String login() {
		User user = new User();
		return "user";
	}
}
