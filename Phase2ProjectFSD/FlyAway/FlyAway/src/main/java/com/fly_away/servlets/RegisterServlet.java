package com.fly_away.servlets;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

import com.fly_away.dao.UserDao;
import com.fly_away.entities.User;
import com.fly_away.helper.ConnectionProvider;

public class RegisterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

		String name = request.getParameter("user_name");
		String email = request.getParameter("user_email");
		String password = request.getParameter("user_password");
		String gender = request.getParameter("gender");
		String role = "user";

		// Create user Object and set all data to that Object

		User user = new User(name, email, password, gender, role);

		// Create UserDao Object

		UserDao dao = new UserDao(ConnectionProvider.getConnection());
		if (dao.saveUser(user)) {
			RequestDispatcher rd = request.getRequestDispatcher("/login.jsp");
			rd.include(request, response);
			out.println(
					"<h1 style='text-align:center;color:green;margin-top: 100px;'> Sucessfully Registerd!!! login to book your ticket...</h1>");

		} else {
			RequestDispatcher rd = request.getRequestDispatcher("/register.jsp");
			rd.include(request, response);
			out.println(
					"<h1 style='text-align:center;color:red;margin-top: 40px; '> Error!!! Something went wrong...</h1>");
		}
	}

}
