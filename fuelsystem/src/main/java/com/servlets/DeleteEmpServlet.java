package com.servlets;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.Employer;
import com.model.employerDButil;


@WebServlet("/DeleteEmpServlet")
public class DeleteEmpServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;


	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		
		boolean isTrue = employerDButil.deleteEmp(id);
		
		if(isTrue== true) {
			
			RequestDispatcher dis = request.getRequestDispatcher("allempdetails");
			dis.forward(request, response);
			
		}
		
		else {
			
			List<Employer> empdetails =employerDButil.getEmpDetails(id);
			request.setAttribute("empdetails", empdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("empacc.jsp");
			dis.forward(request, response);
		}
		
		
		
	}

}
