package com.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class HomeScreen {
	
	@RequestMapping("/")
	public String gohome()
	{
	return "Homescreen";
	}
	
}
