package com.hemant.vyas.springbootopenshiftcustomerexample.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;

import com.hemant.vyas.springbootopenshiftcustomerexample.model.AppUser;
import com.hemant.vyas.springbootopenshiftcustomerexample.model.Customer;
import com.hemant.vyas.springbootopenshiftcustomerexample.service.CustomerService;
import com.hemant.vyas.springbootopenshiftcustomerexample.service.UserService;

@Controller
public class UserController {

	@Autowired
	UserService userService;
	
	@Autowired 
	CustomerService customerService;
	
	@PostMapping("/validateLogin")
	public String validateLogin(@ModelAttribute AppUser appUser, Model model) {
		
		System.out.println("App User " + appUser);
		
		List<Customer> customerList = customerService.customerList();
		model.addAttribute("customers", customerList);
		
		return "customerList";
	}
	
	
	@GetMapping("/login")
    public String login(Model model) {
		model.addAttribute("appUser", new AppUser());
		System.out.println("called login.........");
        return "login";
    }
	
}
