package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;


import com.model.Diesel;
import com.model.ResourseDBUtill;


@WebServlet("/AllProfitData")
public class AllDieselData extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		try {
			
			List<Diesel> dieselData = ResourseDBUtill.getDieselData();
			request.setAttribute("dieselData",dieselData);
			
			}catch(Exception e) {
				e.printStackTrace();
				
				RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
				dis.forward(request, response);
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("AllFuelData.jsp");
			dis.forward(request, response);
			
			
		
	}


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		

		try {
			
			List<Diesel> dieselData = ResourseDBUtill.getDieselData();
			request.setAttribute("dieselData",dieselData);
			
			
			}catch(Exception e) {
				e.printStackTrace();
				RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
				dis.forward(request, response);
			}
			
			RequestDispatcher dis = request.getRequestDispatcher("AllFuelData.jsp");
			dis.forward(request, response);
		

}
	
}
