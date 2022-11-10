package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Petrol;
import com.model.ResourseDBUtill;

/**
 * Servlet implementation class addFuel
 */
@WebServlet("/addFuel")
public class addFuel extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		

		String cate = request.getParameter("cate");
		String date = request.getParameter("date");
		String tcost =request.getParameter("tcost");
		String tax = request.getParameter("tax");
		String dispenser =request.getParameter("dispenser");
		String initqun =request.getParameter("initqun");
		String dprice =request.getParameter("dprice");
		String rqun =request.getParameter("rqun");
		String share =request.getParameter("share");
		
		if(cate.equalsIgnoreCase("diesel")) {
			
			boolean isTrue = ResourseDBUtill.insertSuperDieselData(cate,date, tcost, tax, dispenser, initqun, dprice, rqun, share);
			
			if(isTrue ==true) {
				RequestDispatcher dis = request.getRequestDispatcher("DieselFuelData");
				dis.forward(request, response);		
			}
			
			else {
				RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
				dis.forward(request, response);	
				
			}
			
		}
		
		if(cate.equalsIgnoreCase("petrol")) {
			
			boolean isTrue = ResourseDBUtill.insertSuperDieselData(cate,date, tcost, tax, dispenser, initqun, dprice, rqun, share);
			
			if(isTrue ==true) {
				
				try {
					
					List<Petrol> petrolData = ResourseDBUtill.getPetrolData();
					request.setAttribute("petrolData",petrolData);
					
					
					}catch(Exception e) {
						e.printStackTrace();
					}
					
					RequestDispatcher dis = request.getRequestDispatcher("AllPetrolData.jsp");
					dis.forward(request, response);
				
				
					
			}
			
			else {
				RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
				dis.forward(request, response);	
				
			}
			
		}
		
		
	}

}
