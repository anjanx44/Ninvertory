package com.ninventory.app.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.ninventory.app.model.Users;
import com.ninventory.app.repository.UserRepository;
import com.ninventory.app.service.ImpLoginService;

@Controller
public class LoginController {
	//@Autowired
	Users user1;	
	
	//@Autowired
	ImpLoginService loginservice;
	
	  @GetMapping(value = "/")
	  public String available(Model model) {
		model.addAttribute("user1", new Users()); 
		System.out.println(loginservice.findUserbyEmail("abc@gmail.com")); 
		return "login/login";
	  }
	  
	  @PostMapping(value ="/login")
	  public void Login( Users user ) {
		//System.out.println(user.getEmail());  
		  
		user1 = loginservice.findUserbyEmail(user.getEmail());   
		System.out.println(user1.getEmail()); 
		  
	  }
	  
	  
	  
	  
	  
	  
}
