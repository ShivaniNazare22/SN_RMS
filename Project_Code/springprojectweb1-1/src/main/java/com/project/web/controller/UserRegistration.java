package com.project.web.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.project.web.models.Userslist;
import com.project.web.repositories.userlist_info;

import jakarta.servlet.http.HttpSession;

@Controller
public class UserRegistration {

	
	@Autowired
	private userlist_info ulrepo;
	
	@RequestMapping("/UserRegistration")
	public String goregister()
	{
		return "UserRegistration";
	}
	
	@RequestMapping("/adduser")
	public String adduser(@ModelAttribute Userslist users) {

		
		ulrepo.save(users);
		
		return "redirect:/Thankyouforreg";
	}
	
	@RequestMapping("/Thankyouforreg")
	public String getdata(Model m) {
		
		List<Userslist> al=ulrepo.findAll();
		m.addAttribute("e_data", al);
		
		return "Thankyouforreg";
	}
	
}
