package com.ets.interview.assignment.rest;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.ets.interview.assignment.entity.User;
import com.ets.interview.assignment.service.UserService;

@Controller
@RequestMapping("/users")
public class UserRestController {

	private UserService userService;
	
	@Autowired
	public UserRestController(UserService theUserService) {
		userService = theUserService;
	}
	
	@GetMapping("/list")
	public String listEmployees(Model theModel) {
		
		List<User> theUsers = userService.findAll();
		
		theModel.addAttribute("users", theUsers);
		
		return "users/list-users";
	}
	
	@GetMapping("/showFormForAdd")
	public String showFormForAdd(Model theModel) {
		
		User theUser = new User();
		
		theModel.addAttribute("user", theUser);
		
		return "users/user-form";
	}
	
	@PostMapping("/save")
	public String saveUser(@ModelAttribute("user") User theUser) {
		
		userService.save(theUser);
		
		return "redirect:/users/list";
	}
	
	
	
}










