package com.divergentsl.servletstudent.dao;

import javax.persistence.EntityManager;


import com.divergentsl.servletstudent.entity.Admin;
import com.divergentsl.servletstudent.utility.EntityManagerUtility;

public class AdminDaoImpl  implements AdminDao {

	public Admin login(String username) {
		// TODO Auto-generated method stub
		EntityManager entityManager = EntityManagerUtility.getEntityManager();
//		entityManager.getTransaction().begin();
//		entityManager.persist(username);
//		entityManager.getTransaction().commit();
		
		Admin admin = entityManager.find(Admin.class, username);
		
		entityManager.close();
		return admin;
	}

}
