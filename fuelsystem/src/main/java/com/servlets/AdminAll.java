package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Admin;
import com.model.AdminDButil;


@WebServlet("/AdminAll")
public class AdminAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
		List<Admin> adminDetails = AdminDButil.getallemp();
		request.setAttribute("adminDetails",adminDetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("adminAllDetails.jsp");
		dis.forward(request, response);
		
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
		List<Admin> adminDetails = AdminDButil.getallemp();
		request.setAttribute("adminDetails",adminDetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("adminAllDetails.jsp");
		dis.forward(request, response);
		
		}
		
	

}
