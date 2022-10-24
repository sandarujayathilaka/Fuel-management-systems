package com.servlets;


import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.SerManagerDButil;


@WebServlet("/managerservlet")
public class InsertSmanServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String tel =request.getParameter("tel");
		String address = request.getParameter("address");
		String branch =request.getParameter("branch");
		String password =request.getParameter("password");
		String date =request.getParameter("startdate");
		String email =request.getParameter("email");
		
		
	boolean isTrue = SerManagerDButil.insertSmanager(name, tel, address,branch,password,date,email);
		
		if(isTrue ==true) {
			RequestDispatcher dis = request.getRequestDispatcher("fetchSerMan");
			dis.forward(request, response);		
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
			
		}
		
		
		
	}

}

