package com.divergentsl.servletstudent.sevice;

import java.util.List;

import com.divergentsl.servletstudent.dao.StudentDao;
import com.divergentsl.servletstudent.dao.StudentDaoImpl;
import com.divergentsl.servletstudent.entity.Student;


public class StudentServiceImpl implements StudentService {
	StudentDao<Student> studentDao = new StudentDaoImpl();

	public void insert(int id, String name, String surname, String address) {


		Student student = new Student();
	    student.setId(id);
	    student.setName(name);
	    student.setSurname(surname);
		student.setAddress(address);

		studentDao.insert(student);

	}

	public List<Student> findAll() {
		

		return studentDao.findAll();
	}

	public Student find(int id) {
		return studentDao.find(id);
	}

	public void delete(int id) {
		studentDao.remove(id);
	}

}
