package com.jsp.hibrnate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.entity.Marker;

public class MarkerDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction tr = em.getTransaction();
		
		Marker m1 = new Marker(101, "red", 30.6);
		Marker m2 = new Marker(102, "blue", 27.5);
		Marker m3 = new Marker(103, "black", 31.8);
		
		tr.begin();
		
//		save/insert operation
		
//		em.persist(m1);
//		em.persist(m2);
//		em.persist(m3);
		
		
//		fetch/read data
		
//		Marker m = em.find(Marker.class, 101);
//		System.out.println(m);
		
		
//		delete object
		
//		Marker m = em.find(Marker.class, 101);
//		
//		em.remove(m);
		
		
//		update data
		
		Marker m = em.find(Marker.class, 102);
		
		em.merge(m);
		m.setName("brown");
		m.setPrice(40);
		
		tr.commit();

	}

}

//seperate maven project
//gid- com.jsp
//artifact id- bikecrud
//4 driver classes- insert bike drive
//fetch bike driver
//delete bike driver
//update bike driver
//1 entity class
//
//gid- com.jsp
//artifact id- studentcrud
//4 driver class
//1 entity class
