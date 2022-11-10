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

@WebServlet("/UpdateDiesel")
public class UpdateDiesel extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		
		String pid = request.getParameter("pid");
		String date = request.getParameter("date");
		String tcost =request.getParameter("tcost");
		String tax = request.getParameter("tax");
		String dispenser =request.getParameter("dispenser");
		String initqun =request.getParameter("initqun");
		String dprice =request.getParameter("dprice");
		String rqun =request.getParameter("rqun");
		String share =request.getParameter("share");
		
		boolean isTrue = ResourseDBUtill.updateDiesel(pid,date, tcost, tax, dispenser, initqun,dprice,rqun,share);
		
		if(isTrue== true) {
			
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
		
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);	
			
		}
		
		
	
		
		
	}

}
