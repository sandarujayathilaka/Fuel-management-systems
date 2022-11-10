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
 * Servlet implementation class FuelManagerAll
 */
@WebServlet("/FuelManagerAll")
public class FuelManagerAll extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		

		try {
		List<FuelManagerAcc> fuelMdetails =FuelManDButil.getFuelManDetails();
		request.setAttribute("fuelMdetails", fuelMdetails);
		
		}catch(Exception e) {
			e.printStackTrace();
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
		}
		
		RequestDispatcher dis = request.getRequestDispatcher("fuelManAll.jsp");
		dis.forward(request, response);
		
	}
		
		
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		

		try {
			List<FuelManagerAcc> fuelMdetails =FuelManDButil.getFuelManDetails();
			request.setAttribute("fuelMdetails", fuelMdetails);
			
			}catch(Exception e) {
				e.printStackTrace();
				RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
				dis.forward(request, response);	
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("fuelManAll.jsp");
			dis.forward(request, response);
		
	}

}
