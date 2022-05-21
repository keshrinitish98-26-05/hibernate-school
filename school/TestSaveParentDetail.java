package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveParentDetail {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		Parent parent=new Parent();
		parent.setName("Nitish");
		parent.setEmail("nitish@gamil.com");
		parent.setPhone(878744567);
		
		entityTransaction.begin();
		
		entityManager.persist(parent);
		
		entityTransaction.commit();
	}
    
}
