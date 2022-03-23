package com.fly_away.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;

import com.fly_away.dao.FlightsDao;
import com.fly_away.entities.Flights;
import com.fly_away.helper.ConnectionProvider;

public class BookingServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		int fid = Integer.parseInt(request.getParameter("id").trim());

		FlightsDao dao = new FlightsDao(ConnectionProvider.getConnection());

		Flights f = dao.getFlightsByFid(fid);

		if (f == null) {

			response.sendRedirect("index.jsp");

		} else {

			request.setAttribute("payment", f);
			RequestDispatcher rd = request.getRequestDispatcher("payment.jsp");
			rd.forward(request, response);

		}

	}

}
