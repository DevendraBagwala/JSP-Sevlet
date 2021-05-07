package com.divergentsl.servletstudent.controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.divergentsl.servletstudent.sevice.AdminService;
import com.divergentsl.servletstudent.sevice.AdminServiceImpl;


@WebServlet("/adminController")
public class AdminController  extends HttpServlet  {

	
	private static final long serialVersionUID = 1L;

	private final AdminService adminService = new AdminServiceImpl();

	public AdminController() {
		super();
	}

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		String username = request.getParameter("username");
		String password = request.getParameter("password");

		if (adminService.login(username, password)) {	
			response.sendRedirect("AdminMenu.jsp");
		} else {
			RequestDispatcher dispatcher = request.getRequestDispatcher("index.jsp");
			request.setAttribute("error", "Incorrect Username & Password");
			dispatcher.forward(request, response);
		}
    }
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}