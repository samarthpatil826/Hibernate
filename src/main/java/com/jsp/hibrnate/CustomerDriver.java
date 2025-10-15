package com.jsp.hibrnate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.entity.Customer;

public class CustomerDriver {
	
	public static void main(String[] args) {
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tr = em.getTransaction();
		
		 Customer c = new Customer(101, "raj", 23, "9834591059");
		 
		 tr.begin();
		 
		 em.persist(c);
		 
		 tr.commit();
		 
		 
	}

}
