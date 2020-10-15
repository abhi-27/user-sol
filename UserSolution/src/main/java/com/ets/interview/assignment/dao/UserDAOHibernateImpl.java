package com.ets.interview.assignment.dao;

import java.util.List;

import javax.persistence.EntityManager;

import org.hibernate.Session;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.ets.interview.assignment.entity.User;

@Repository
public class UserDAOHibernateImpl implements UserDAO {

	private EntityManager entityManager;
		
	@Autowired
	public UserDAOHibernateImpl(EntityManager theEntityManager) {
		entityManager = theEntityManager;
	}
	
	
	@Override
	public List<User> findAll() {

		Session currentSession = entityManager.unwrap(Session.class);
		
		Query<User> theQuery =
				currentSession.createQuery("from User", User.class);
		
		List<User> Users = theQuery.getResultList();
		
		return Users;
	}


	


	@Override
	public void save(User theUser) {

		Session currentSession = entityManager.unwrap(Session.class);
		
		currentSession.saveOrUpdate(theUser);
	}


	
}







