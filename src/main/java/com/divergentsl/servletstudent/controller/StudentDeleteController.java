package com.divergentsl.servletstudent.controller;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.servletstudent.sevice.StudentService;
import com.divergentsl.servletstudent.sevice.StudentServiceImpl;
@WebServlet("/studentDelete")
public class StudentDeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;
	//private int id;
    
    public StudentDeleteController() {
        super();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		int studentId = Integer.parseInt(request.getParameter("id"));
		
		StudentService studentService = new StudentServiceImpl();
		
		studentService.delete(studentId);
//		RequestDispatcher dispatcher = request.getRequestDispatcher("patientList");
//		dispatcher.forward(request, response);
		response.sendRedirect("studentList");
	}
}
