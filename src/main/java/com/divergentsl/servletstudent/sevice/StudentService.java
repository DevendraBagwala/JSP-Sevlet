package com.divergentsl.servletstudent.sevice;

import java.util.List;

import com.divergentsl.servletstudent.entity.Student;


public interface StudentService {
   public void insert(int id, String name, String surname,  String address) ;
	
	
	public List<Student> findAll();
	
     public Student find(int id);
	
	public void delete(int id);


}
