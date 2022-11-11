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



@WebServlet("/updateManagerServlet")
public class updateManagerServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");
		String name = request.getParameter("name");
		String branch =request.getParameter("branch");
		String tel =request.getParameter("tel");
		String email =request.getParameter("email");
		String address =request.getParameter("address");
		String pass =request.getParameter("password");
		String date =request.getParameter("startdate");
		
		boolean isTrue = SerManagerDButil.updateSerMan(id, name, branch,tel,email,address,pass,date);
		
		if(isTrue== true) {
			
			List<SerManagerAcc> serMdetails = SerManagerDButil.getSerManDetails(id);
			request.setAttribute("serMdetails", serMdetails);
			
			RequestDispatcher dis = request.getRequestDispatcher("fetchSerMan"); //redirect to SerManAllServlet
			dis.forward(request, response);
			
		}
		
		else {
			
			
			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);
		}
		
		

	}

}
