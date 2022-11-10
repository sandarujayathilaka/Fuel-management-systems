package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.FuelManDButil;
import com.model.FuelManagerAcc;


/**
 * Servlet implementation class UpdateFuelMan
 */
@WebServlet("/UpdateFuelMan")
public class UpdateFuelMan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {


		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String tel =request.getParameter("tel");
		String address =request.getParameter("address");
		String pass =request.getParameter("password");
		String nic =request.getParameter("nic");
		String marit =request.getParameter("marit");
		
		boolean isTrue = FuelManDButil.updateFuelMan(id,name,tel,address,pass,nic,marit);
		
		if(isTrue== true) {
			
			List<FuelManagerAcc> serMdetails = FuelManDButil.getFuelManDetails(id);
			request.setAttribute("serMdetails", serMdetails);
			
			
			RequestDispatcher dis = request.getRequestDispatcher("FuelManAllServlet");
			dis.forward(request, response);
			
		}
		
		else {
			
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);
		}
		
	}

}
