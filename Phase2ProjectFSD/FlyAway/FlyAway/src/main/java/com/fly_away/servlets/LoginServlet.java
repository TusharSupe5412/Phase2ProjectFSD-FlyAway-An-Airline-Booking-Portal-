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

import com.fly_away.dao.UserDao;
import com.fly_away.entities.User;
import com.fly_away.helper.ConnectionProvider;

public class LoginServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		response.setContentType("text/html");

		PrintWriter out = response.getWriter();

//		login----->> fetch user name and password from request

		String userEmail = request.getParameter("email");
		String userPassword = request.getParameter("password");

		UserDao dao = new UserDao(ConnectionProvider.getConnection());

		User u = dao.getUserByEmailAndPassword(userEmail, userPassword);

		if (u == null) {

			response.sendRedirect("login.jsp");

		} else {

			if (u.getRole().equals("admin")) {

				RequestDispatcher rd = request.getRequestDispatcher("admin.jsp");
				rd.forward(request, response);

				HttpSession s = request.getSession();
				s.setAttribute("currentUser", u);
			} else {

				RequestDispatcher rd = request.getRequestDispatcher("user.jsp");
				rd.forward(request, response);

				HttpSession s = request.getSession();
				s.setAttribute("currentUser", u);
			}

		}
	}

}
