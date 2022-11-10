package com.servlets;

import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Diesel;
import com.model.ResourseDBUtill;

/**
 * Servlet implementation class CalculateSev
 */
@WebServlet("/CalculateSev")
public class CalculateSev extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("id");

        Diesel dieselob = ResourseDBUtill.getDieselcal(id);
			
	    double profit = dieselob.calprofit();
	    double sold =dieselob.soldPetroleumValue();
	  
	    request.setAttribute("profit",profit);
	    request.setAttribute("sold",sold);
	
		RequestDispatcher dis = request.getRequestDispatcher("Calculator.jsp");
		dis.forward(request, response);

		
	}

}
