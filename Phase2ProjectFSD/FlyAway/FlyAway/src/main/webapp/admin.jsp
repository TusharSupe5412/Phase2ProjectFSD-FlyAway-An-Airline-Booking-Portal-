<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
	<%@ page import="com.fly_away.entities.*" %>
	<%@ page import="com.fly_away.dao.*" %>
	<%@ page import="com.fly_away.helper.*" %>
	<%@ page import="com.fly_away.servlets.*" %>
	<%@page import="java.sql.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Admin login</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

</head>
<style>
body {
	background-repeat: no-repeat;
	background-attachment: fixed;
	background-size: cover;
	background-image: url('img/background.jpg');
}
</style>
<body>



	<!-- Navbar starts here -->

	<nav class="navbar navbar-expand-lg navbar-dark primary-background">
		<a class="navbar-brand" href="index.jsp"><span
			class="fa fa-plane"></span> FlyAway</a>
		<button class="navbar-toggler" type="button" data-toggle="collapse"
			data-target="#navbarSupportedContent"
			aria-controls="navbarSupportedContent" aria-expanded="false"
			aria-label="Toggle navigation">
			<span class="navbar-toggler-icon"></span>
		</button>

		<div class="collapse navbar-collapse" id="navbarSupportedContent">
			<ul class="navbar-nav mr-auto">
				<li class="nav-item active"><a class="nav-link" href="#"><span
						class="fa fa-bell-o"></span> An Airline Booking Portal <span
						class="sr-only">(current)</span></a></li>


				</li>
				<li class="nav-item"><a class="nav-link" href="SearchServlet"><span
						class="fa fa-paper-plane-o"></span> Master list of airlines</a></li>
				<li class="nav-item"><a class="nav-link" href="saveFlights.jsp"><span
						class="fa fa-server"></span> Save Flight Details</a></li>
				<li class="nav-item"><a class="nav-link" href="contactUs.jsp"><span
						class="fa fa-address-card-o"></span> Contact us</a></li>

			</ul>
			<ul class="navbar-nav mr-right">
				
				<li class="nav-item"><a class="nav-link" href="LogoutServlet"><span
						class="fa fa-user-plus"></span> Logout</a></li>
			</ul>
		</div>
	</nav>



	<!-- Navbar ends here -->

</body>
</html>