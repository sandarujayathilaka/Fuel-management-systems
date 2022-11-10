package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.AdminDButil;

@WebServlet("/insertAdmin")
public class InsertAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String tel =request.getParameter("tel");
		String address = request.getParameter("address");
		String nic =request.getParameter("nic");
		String uname =request.getParameter("uname");
		String pass =request.getParameter("pass");
		
		boolean isTrue = AdminDButil.insertAdmin(name, tel, address, nic,uname,pass);
		
		if(isTrue ==true) {
			RequestDispatcher dis = request.getRequestDispatcher("allempdetails");
			dis.forward(request, response);		
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
			
		}
	}

}
