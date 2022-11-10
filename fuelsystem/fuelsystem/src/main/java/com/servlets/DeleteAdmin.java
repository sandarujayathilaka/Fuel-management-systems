package com.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.AdminDButil;


@WebServlet("/DeleteAdmin")
public class DeleteAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		boolean isTrue = AdminDButil.deleteadmin(id);
		
		if(isTrue== true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("allempdetails");
			dis.forward(request, response);
			
		}
		
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
		}
		
		
		
	}

}
