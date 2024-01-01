package com.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class MainController {

	@RequestMapping("/")
	public String getHome()
	{
		System.out.println("This is Home page...");
		
		return "home";
	}

	@RequestMapping("/contact")
	public String getContact()
	{
		System.out.println("This is Contact page...");
		
		return "contact";
	}
	
}
