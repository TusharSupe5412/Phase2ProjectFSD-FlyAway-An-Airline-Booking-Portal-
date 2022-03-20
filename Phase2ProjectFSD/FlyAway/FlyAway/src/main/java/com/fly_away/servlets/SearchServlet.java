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
import com.fly_away.entities.User;
import com.fly_away.helper.ConnectionProvider;



public class SearchServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		FlightsDao dao = new FlightsDao(ConnectionProvider.getConnection());
		
		List<Flights> f = dao.getAllFlights();
		
		if(f.isEmpty()) {

			response.sendRedirect("index.jsp");
			
			
		}else {
			
			request.setAttribute("flightsDetails",f);
			RequestDispatcher rd=request.getRequestDispatcher("flightDetails.jsp");  
		    rd.include(request, response); 
			
			
			
			
		
		}
		
	}

}
