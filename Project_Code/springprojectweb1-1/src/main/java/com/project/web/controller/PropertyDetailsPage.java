package com.project.web.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.project.web.models.pdetails;
import com.project.web.repositories.pdetails_Info;

@Controller
public class PropertyDetailsPage {
	@Autowired
	private pdetails_Info pdrepo;
	
	@RequestMapping("/PropertyRegistrationPage")
	public String AddProperty()
	{
		return "PropertyRegistrationPage";
	}
	
	@RequestMapping("/Thankyouforposting")
	public String Thankyouprop()
	{
		return "Thankyouforposting";
	}
	
	@RequestMapping("/WelcomeOwnerPage")
	public String WelOwner()
	{
		return "WelcomeOwnerPage";
	}
	
	@GetMapping("/addpropertydrop")
    public String addpropertydrop(Model model) {
        model.addAttribute("propdetails", new pdetails());
        return "Thankyouforreg";
    }
	
	@RequestMapping("/addproperty")
	public String addproperty(@ModelAttribute pdetails propdetails) {

		
		pdrepo.save(propdetails);
		
		return "redirect:/Thankyouforposting";
	}
	
}
