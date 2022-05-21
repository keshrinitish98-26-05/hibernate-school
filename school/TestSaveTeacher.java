package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.EntityTransaction;
import javax.persistence.Persistence;

public class TestSaveTeacher {
	
	public static void main(String[] args) {
		
		EntityManagerFactory entityManagerFactory=Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager=entityManagerFactory.createEntityManager();
		EntityTransaction entityTransaction=entityManager.getTransaction();
		
		
		Teacher teacher=new Teacher();
		teacher.setId(1);
		teacher.setName("Nitish");
		teacher.setEmail("nitish@gmail.com");
		teacher.setPhone(993786543);
		teacher.setGender("male");
		
		entityTransaction.begin();
		
		entityManager.persist(teacher);
		
		entityTransaction.commit();
		System.out.println("Done");
		
	}

}
