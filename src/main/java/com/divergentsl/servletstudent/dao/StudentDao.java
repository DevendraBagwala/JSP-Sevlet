package com.divergentsl.servletstudent.dao;

import java.util.List;

import com.divergentsl.servletstudent.entity.Student;

public interface StudentDao <student> {

	public void insert(Student student);

	public  Student find(int id);

	public List<Student> findAll();


	public void remove(int id);
}
