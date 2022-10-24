package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employer;
import com.model.employerDButil;


@WebServlet("/EmpAllServlet")
public class EmpAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
		List<Employer> empdetails = employerDButil.getallemp();
		request.setAttribute("empdetails", empdetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("empAllDetails.jsp");
		dis.forward(request, response);
		
		}
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		try {
		List<Employer> empdetails = employerDButil.getallemp();
		request.setAttribute("empdetails", empdetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("empAllDetails.jsp");
		dis.forward(request, response);
		
		}
		
	

}
