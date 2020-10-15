package com.ets.interview.assignment.service;

import java.util.List;

import com.ets.interview.assignment.entity.User;

public interface UserService {

	public List<User> findAll();
	
	public void save(User theUser);
	

	
}
