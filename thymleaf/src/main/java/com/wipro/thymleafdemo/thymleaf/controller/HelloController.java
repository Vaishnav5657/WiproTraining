package com.wipro.thymleafdemo.thymleaf.controller;


import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


@Controller
public class HelloController {


	@GetMapping("/hello")
	String showWelcome(Model m)
	{
		m.addAttribute("name", "Vaishnav");
		return "index";		
	}

}


