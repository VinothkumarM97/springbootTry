package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeController {
	@RequestMapping("home")
	public String home() {
		System.out.println("in controller");
		return "home.jsp";
	}

	@RequestMapping("login")
	public String login() {
		System.out.println("login controller");
		return "login.jsp";
	}
}
