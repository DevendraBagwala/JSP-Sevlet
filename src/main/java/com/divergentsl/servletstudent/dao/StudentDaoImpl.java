package com.divergentsl.servletstudent.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Root;

import com.divergentsl.servletstudent.entity.Student;
import com.divergentsl.servletstudent.utility.EntityManagerUtility;

public class StudentDaoImpl implements  StudentDao <Student>{
	

	public void insert(Student student) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		entityManager.persist(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

	public Student find(int id) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		Student student = entityManager.find(Student.class, id);
		entityManager.close();
		return student;
	}

	public List<Student> findAll() {
		
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		
		CriteriaQuery<Student> criteriaQuery = entityManager.getCriteriaBuilder().createQuery(Student.class);
		Root<Student> root = criteriaQuery.from(Student.class);
		
		List<Student> students = entityManager.createQuery(criteriaQuery).getResultList();
		entityManager.close();
		return students;
		
	}

	public void remove(int studentId) {
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
		entityManager.getTransaction().begin();
		
		Student student = entityManager.find(Student.class, studentId);
		if (student != null)
			entityManager.remove(student);
		entityManager.getTransaction().commit();
		entityManager.close();
	}

}
