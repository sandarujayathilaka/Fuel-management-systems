package com.fuelsystem;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/insertEmpServlet")
public class insertEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String name = request.getParameter("name");
		String tel =request.getParameter("tel");
		String address = request.getParameter("address");
		String nic =request.getParameter("nic");
		
		boolean isTrue = employerDButil.insertEmp(name, tel, address, nic);
		
		if(isTrue ==true) {
			RequestDispatcher dis = request.getRequestDispatcher("completed.jsp");
			dis.forward(request, response);		
		}
		
		else {
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
			
		}
	}

}
