package com.divergentsl.servletstudent.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.servletstudent.sevice.StudentService;
import com.divergentsl.servletstudent.sevice.StudentServiceImpl;

@WebServlet("/studentInsert")
public class StudentInsertController  extends HttpServlet {

	private static final long serialVersionUID = 1L;
    
    public StudentInsertController() {
        super();
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		int id = Integer.parseInt(request.getParameter("id"));
		String name = request.getParameter("name");
	    String surname = request.getParameter("surname");
		String address = request.getParameter("address");
		
		StudentService studentService = new StudentServiceImpl();
		studentService.insert(id, name, surname,address);
		
		response.sendRedirect("StudentMenu.jsp");
		
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		doGet(request, response);
	}
}
