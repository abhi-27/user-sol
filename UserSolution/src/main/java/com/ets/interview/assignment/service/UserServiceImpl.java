package com.ets.interview.assignment.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.ets.interview.assignment.dao.UserDAO;
import com.ets.interview.assignment.entity.User;

@Service
public class UserServiceImpl implements UserService {

	private UserDAO userDAO;
	
	@Autowired
	public UserServiceImpl(UserDAO theUserDAO) {
		userDAO = theUserDAO;
	}
	
	@Override
	@Transactional
	public List<User> findAll() {
		return userDAO.findAll();
	}

	
	@Override
	@Transactional
	public void save(User theUser) {
		userDAO.save(theUser);
	}

	

}






