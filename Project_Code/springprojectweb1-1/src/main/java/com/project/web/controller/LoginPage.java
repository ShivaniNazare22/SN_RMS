package com.project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.web.models.ListofUsers;
import com.project.web.repositories.userlist_info;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginPage {
	@Autowired
	private userlist_info repo;
	
	@GetMapping("/LoginPage")
	public String logintosite()
	{
		return "LoginPage";
	}
	
	@RequestMapping("/logintoportal")
	public String logintoportal(@RequestParam String username,@RequestParam String password, String usertype,HttpSession login)
	{
		ListofUsers st = repo.findByusername(username); 
		
		System.out.println(st);
		
		if(st!=null && st.getusername().equals(username) && st.getpassword().equals(password))
		{
			if(st.getusertype().equals("Owner")){
			login.setAttribute("login", st);
			return "WelcomeOwnerPage";
			}
			else {
			return "Thankyouforreg";
			}
		}
		else	
		{
		return "UserRegistration";	
		
		}
}
}
