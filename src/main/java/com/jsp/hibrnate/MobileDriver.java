package com.jsp.hibrnate;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

import com.jsp.hibernate.entity.Mobile;

public class MobileDriver {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("samarth");
		
		EntityManager em = emf.createEntityManager();
		
		EntityTransaction et = em.getTransaction();
		
        Mobile m = new Mobile(101, "apple", 70000);
		
		
//		et.begin();
//		
//		em.persist(m);
//		
//		
//		et.commit();
        
        
//        Mobile m1 = em.find(Mobile.class, 101);
//        System.out.println(m1);
        
//        Mobile m2 = em.find(Mobile.class, 101);
//        System.out.println(m2);
//        
//        
        EntityManager em1 = emf.createEntityManager();
        
//        Mobile m3 = em1.find(Mobile.class, 101);
//        System.out.println(m3);
//        
        Mobile m4 = em1.find(Mobile.class, 101);
        System.out.println(m4);
        

	}

}
