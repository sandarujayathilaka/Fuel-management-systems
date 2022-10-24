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

@WebServlet("/employerservlet")
public class employerservlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		int empid = Integer.parseInt(request.getParameter("empid")); 
		
		employerDButil.validate(empid);
		
		try {
		List<Employer> empdetails = employerDButil.validate(empid);
		request.setAttribute("empdetails", empdetails);
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("empacc.jsp");
		dis.forward(request, response);
		
		}
	}


