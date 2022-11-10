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
 * Servlet implementation class DeletePetrol
 */
@WebServlet("/DeletePetrol")
public class DeletePetrol extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		String id = request.getParameter("pid");

		boolean isTrue = ResourseDBUtill.deletePetrol(id);

		if (isTrue == true) {

			try {

				List<Petrol> petrolData = ResourseDBUtill.getPetrolData();
				request.setAttribute("petrolData", petrolData);

			} catch (Exception e) {
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
