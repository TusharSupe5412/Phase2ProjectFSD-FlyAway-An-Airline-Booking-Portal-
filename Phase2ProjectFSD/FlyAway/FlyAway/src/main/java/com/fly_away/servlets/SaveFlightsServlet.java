package com.fly_away.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

import com.fly_away.dao.FlightsDao;
import com.fly_away.entities.Flights;
import com.fly_away.helper.ConnectionProvider;

public class SaveFlightsServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		String source = request.getParameter("user_source");
		String destination = request.getParameter("user_destination");
		String airline = request.getParameter("airline");
		String ticket = request.getParameter("ticket");
		String date = request.getParameter("date");

		Flights f = new Flights(source, destination, airline, ticket, date);

		FlightsDao dao = new FlightsDao(ConnectionProvider.getConnection());

		if (dao.saveFlights(f)) {
			RequestDispatcher rd = request.getRequestDispatcher("/saveFlights.jsp");
			rd.include(request, response);
			out.println(
					"<h1 style='text-align:center;color:green;margin-top: 10px;'> Details successfully saved in Database...</h1>");

		} else {

			RequestDispatcher rd = request.getRequestDispatcher("/saveFlights.jsp");
			rd.include(request, response);
			out.println(
					"<h1 style='text-align:center;color:red;margin-top: 10px;'> Error !!! Something went wrong...</h1>");

		}

	}

}
