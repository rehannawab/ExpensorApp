package com.fisys.expensor.repo;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.fisys.expensor.model.Account;

@Repository
public class AccountRepoHibernate {

	@Autowired
	private SessionFactory sessionFactory;
	
	public SessionFactory getSessionFactory() {
		return sessionFactory;
	}

	public void setSessionFactory(SessionFactory sessionFactory) {
		this.sessionFactory = sessionFactory;
	}

	public Long save(Account account){
		
		Session session = getSessionFactory().openSession();
		
		session.beginTransaction();
		
		Long id = (Long) session.save(account);
		
		session.getTransaction().commit();
		
		session.close();
		
		return id;
		
	}
	
}
