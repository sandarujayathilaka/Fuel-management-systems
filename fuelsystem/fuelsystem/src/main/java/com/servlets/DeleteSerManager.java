package com.servlets;


import java.io.IOException;


import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.model.SerManagerDButil;


/**
 * Servlet implementation class DeleteSerManager
 */
@WebServlet("/DeleteSerManager")
public class DeleteSerManager extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		String id = request.getParameter("id");

		boolean isTrue = SerManagerDButil.deleteSerManager(id);

		if (isTrue == true) {

			RequestDispatcher dis = request.getRequestDispatcher("fetchSerMan");//redirect to SerManAllServlet servlet
			dis.forward(request, response);

		}

		else {

			RequestDispatcher dis = request.getRequestDispatcher("notcompleted.jsp");
			dis.forward(request, response);
		}

	}

}
