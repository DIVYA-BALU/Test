package com.repo.project1;

import java.util.Date; 

import org.hibernate.Session; 

public class GeekUserDetailsTest { 
	public static void main(String[] args) { 

		// open the session 
		Session session = HibernateUtil.getSessionFactory().openSession(); 

		// For doing any CRUD operation, 
		// let us start a transaction 
		session.beginTransaction(); 

		// Create an object of GeekUserDetails 
//		GeekUserDetails geekUser = new GeekUserDetails(); 
		User geekUser = new User(); 
		// Set all the details required 
		// to insert into the table 
		geekUser.setUserId(2); 
		geekUser.setUsername("GeekUser2"); 
		geekUser.setPassword("password1");

		// Just a save statement is enough which 
		// automatically creates an insert statement 
		session.save(geekUser); 

		// commit will help to complete 
		// the changes in the table 
		session.getTransaction().commit(); 

		// close the session 
		session.close(); 
	} 
}

