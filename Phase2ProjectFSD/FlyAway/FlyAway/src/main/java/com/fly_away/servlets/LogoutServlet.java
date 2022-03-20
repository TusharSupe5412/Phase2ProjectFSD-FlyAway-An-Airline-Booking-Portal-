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

public class LogoutServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		
		response.setContentType("text/html");
		PrintWriter out = response.getWriter();
		
		
		HttpSession s = request.getSession();
		
		s.removeAttribute("currentUser");
		
		
		RequestDispatcher rd=request.getRequestDispatcher("login.jsp");  
	    rd.include(request, response); 
	    
	    out.println("<h1 style='text-align:center;color:green;margin-top: 10px;'> Successfully Logout...</h1>");
		
		
	}

}
