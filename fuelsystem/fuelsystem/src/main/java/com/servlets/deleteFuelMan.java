package com.servlets;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.FuelManDButil;


/**
 * Servlet implementation class deleteFuelMan
 */
@WebServlet("/deleteFuelMan")
public class deleteFuelMan extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("id");

		boolean isTrue = FuelManDButil.deleteFuelManager(id);

		if (isTrue == true) {

			RequestDispatcher dis = request.getRequestDispatcher("FuelManAllServlet");
			dis.forward(request, response);

		}

		else {

			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);
		}
		
	}

}
