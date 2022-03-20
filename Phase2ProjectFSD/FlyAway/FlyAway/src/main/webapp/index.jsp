<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="com.fly_away.helper.*"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
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
	background-image: url('img/plane.jpg');
}
</style>

<body>

	<!-- Navbar -->

	<%@ include file="navbar.jsp"%>

	<!-- Banner Start here  -->

	<div class="container-fluid p-0 m-0">

		<div class="jumbotron primary-background text-white banner-background">
			<div class="container">
				<h3 class="display-3">Welcome to Fly Away</h3>
				<h6>"Traveling the globe, making dreams come true."</h6>



			</div>
		</div>
	</div>

	<!-- Banner ends here  -->

	<!-- Registration form -->

	<main>
		<div class="col-md-5 offset-md-3">

			<div class="card">
				<div class="card-header text-center primary-background text-white">
					<span class="fa fa-user-circle fa-3x"></span> <br>
					<h3>
						Source <span class="fa fa-exchange"></span> Destination
					</h3>
				</div>
				<div class="card-body">
					<form id="reg-form" action="AvailableFlightsServlet" method="get">

						<div class="form-group">
							<label for="user_source">Source</label> <input name="user_source"
								type="text" class="form-control" id="user_source"
								aria-describedby="emailHelp"
								placeholder="Enter your source here">
						</div>


						<div class="form-group">
							<label for="destination">Destination</label> <input
								name="user_destination" type="text" class="form-control"
								id="user_destination" aria-describedby="emailHelp"
								placeholder="Enter your destination here">

						</div>


						<div class="form-group">
							<label for="date">Date of journy</label> <input name="date"
								type="date" class="form-control" id="date"
								placeholder="Select date">
						</div>



						<br>

						<div class="container text-center">
							<button id="submit-btn" type="submit" class="btn btn-primary ">Search</button>
						</div>

					</form>

				</div>


			</div>


		</div>



	</main>



	<!-- Js goes here......  -->
	<script src="https://code.jquery.com/jquery-3.6.0.min.js"
		integrity="sha256-/xUj+3OJU5yExlq6GSYGSHk7tPXikynS7ogEvDej/m4="
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/popper.js@1.12.9/dist/umd/popper.min.js"
		integrity="sha384-ApNbgh9B+Y1QKtv3Rn7W3mgPxhU9K/ScQsAP7hUibX39j7fakFPskvXusvfa0b4Q"
		crossorigin="anonymous"></script>
	<script
		src="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/js/bootstrap.min.js"
		integrity="sha384-JZR6Spejh4U02d8jOt6vLEHfe/JQGiRRSQQxSfFWpi1MquVdAyjUar5+76PVCmYl"
		crossorigin="anonymous"></script>


</body>
</html>