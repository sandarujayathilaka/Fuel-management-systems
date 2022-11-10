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
 * Servlet implementation class UpdatePetrol
 */
@WebServlet("/UpdatePetrol")
public class UpdatePetrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
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
		
		boolean isTrue = ResourseDBUtill.updatePetrol(pid,date, tcost, tax, dispenser, initqun,dprice,rqun,share);
		
		if(isTrue== true) {
			
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
			
			
			RequestDispatcher dis = request.getRequestDispatcher("adminAllDetails.jsp");
			dis.forward(request, response);
		}
		
		
		
	}

}
