package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.Petrol;
import com.model.ResourseDBUtill;

/**
 * Servlet implementation class CalPetrol
 */
@WebServlet("/CalPetrol")
public class CalPetrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String id = request.getParameter("id");

        Petrol petrolob = ResourseDBUtill.getPetrolcal(id);
			
	    double profit = petrolob.calprofit();
	    double sold = petrolob.soldPetroleumValue();
	  
	    request.setAttribute("profit",profit);
	    request.setAttribute("sold",sold);
	
		RequestDispatcher dis = request.getRequestDispatcher("Calculator.jsp");
		dis.forward(request, response);

		
	}

}
