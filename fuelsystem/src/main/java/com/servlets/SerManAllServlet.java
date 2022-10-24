package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.SerManagerAcc;
import com.model.SerManagerDButil;



@WebServlet("/SerManAllServlet")
public class SerManAllServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
	

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		try {
		List<SerManagerAcc> serMdetails = SerManagerDButil.getSerManDetails();
		request.setAttribute("serMdetails", serMdetails);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("managerall.jsp");
		dis.forward(request, response);
		
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		try {
		List<SerManagerAcc> serMdetails = SerManagerDButil.getSerManDetails();
		request.setAttribute("serMdetails", serMdetails);
		
		}catch(Exception e) {
			e.printStackTrace();
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("managerall.jsp");
		dis.forward(request, response);
		
	}

}
