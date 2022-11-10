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


@WebServlet("/UpdateAdmin")
public class UpdateAdmin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String tel =request.getParameter("tel");
		String address =request.getParameter("address");
		String nic =request.getParameter("nic");
		String pass =request.getParameter("pass");
		String uname =request.getParameter("uname");
		
		boolean isTrue = AdminDButil.updateAdmin(id, name, tel, address, nic,uname,pass);
		
		if(isTrue== true) {
			
			List<Admin> adminDetails =AdminDButil.getAdminDetails(id);
			request.setAttribute("adminDetails", adminDetails);
			
			//response.sendRedirect("empAllDetails.jsp");
			
			RequestDispatcher dis = request.getRequestDispatcher("allempdetails");
			dis.forward(request, response);
			
		}
		
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
			
		}
		
		
	}

}
