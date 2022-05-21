package com.ty.school;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

public class TestGetAllStudent {
	public static void main(String[] args) {
		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();
		
		String sql="SELECT s FROM Student s";
		
		Query query=entityManager.createQuery(sql);
		
		List<Student> student=query.getResultList();
		
		for(Student student2: student)
		{
			System.out.println("ID is : " + student2.getId());
			System.out.println("Name is : " + student2.getName());
			System.out.println("Percentage : " + student2.getPercentage());
			System.out.println("-----------------------------------------");
		}
	}

}
