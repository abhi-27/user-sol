package com.ets.interview.assignment.dao;

import java.util.List;

import com.ets.interview.assignment.entity.User;

public interface UserDAO {

	public List<User> findAll();
		
	public void save(User theEmployee);
	
	
	
}
