package com.divergentsl.servletstudent.sevice;

import com.divergentsl.servletstudent.dao.AdminDao;
import com.divergentsl.servletstudent.dao.AdminDaoImpl;
import com.divergentsl.servletstudent.entity.Admin;

public class AdminServiceImpl implements AdminService {

	
	public boolean login(String username, String password) {
		// TODO Auto-generated method stub
		AdminDao adminDao = new AdminDaoImpl();

		Admin admin = adminDao.login(username);
		if (admin == null) return false;
			return username.equals( admin.getUsername( )) && password.equals(admin.getPassword());

	}

}
