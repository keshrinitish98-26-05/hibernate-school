package com.ty.school;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import com.mysql.cj.protocol.x.SyncFlushDeflaterOutputStream;

public class TestGetTeacherById {

	public static void main(String[] args) {

		EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("vikas");
		EntityManager entityManager = entityManagerFactory.createEntityManager();

		Teacher teacher = entityManager.find(Teacher.class, 1);
		// System.out.println(teacher);

		if (teacher != null) {
			System.out.println("Id : " + teacher.getId());
			System.out.println("Name : " + teacher.getName());
			System.out.println("Email : " + teacher.getEmail());
			System.out.println("Phone : " + teacher.getPhone());
			System.out.println("gender : " + teacher.getGender());
		} else {
			System.out.println("No such id present");
		}
	}

}
