package com.fisys.expensor.test;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import com.fisys.expensor.model.Account;
import com.fisys.expensor.repo.AccountRepoHibernate;

public class FirstTest {

	public static void main(String[] args) {
		ApplicationContext ctx = new ClassPathXmlApplicationContext("spring.xml");
		
		Account account = new Account();
		account.setBalance(100.0);
		account.setName("MainAccount");
		
		AccountRepoHibernate arh = ctx.getBean("accountRepoHibernate", AccountRepoHibernate.class);
		arh.save(account);
		
	}
	
}
