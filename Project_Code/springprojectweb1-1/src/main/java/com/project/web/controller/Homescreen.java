package com.project.web.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class Homescreen {

	
	@RequestMapping("/")
	public String gohome()
	{
		return "Homescreen";
	}
	
	@RequestMapping("/contactus")
	public String gocontact()
	{
		return "contactus";
	}
	
	@RequestMapping("/aboutus")
	public String goabout()
	{
		return "aboutus";
	}
	
	@RequestMapping("/Userregistration")
	public String Userregistration()
	{
		return "UserRegistration";
	}
	@RequestMapping("/Postpropertyform")
	public String Postpropertyform()
	{
		return "PostPropertyform";
	}
}
