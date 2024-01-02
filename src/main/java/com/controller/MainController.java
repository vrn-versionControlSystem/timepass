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

	@RequestMapping("/a")
	public String geta()
	{
		System.out.println("This is Contact page...");
		
		return "contact";
	}
	
	@RequestMapping("/b")
	public String getb()
	{
		System.out.println("This is b page...");
		
		return "b";
	}
	
	@RequestMapping("/form")
	public String getForm()
	{
		System.out.println("This is Form page...");
		
		return "form";
	}
	@RequestMapping("/output")
	public String getOutput()
	{
		System.out.println("This is Output page...");
		
		return "output";
	}
	
	@RequestMapping("/session1")
	public String getSession1()
	{
		System.out.println("This is Session1 page...");
		
		return "session1";
	}
	
}
