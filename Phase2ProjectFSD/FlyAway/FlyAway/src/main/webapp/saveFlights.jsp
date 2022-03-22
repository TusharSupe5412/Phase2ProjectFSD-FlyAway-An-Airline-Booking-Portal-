<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Save flights details</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">

<style>
body{
						background-repeat: no-repeat;
					    background-attachment: fixed;
					    background-size: cover;
						background-image: url('img/airlines.jpg');
}
}
</style>
</head>
<body>

<!-- Navbar starts here -->

	<nav class="navbar navbar-expand-lg navbar-dark primary-background">
		<a class="navbar-brand" href="index.jsp"><span
			class="fa fa fa-plane"></span> FlyAway</a>
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


	<!-- Save flights starts here  -->

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
					<form id="reg-form" action="SaveFlightsServlet" method="get">

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
							<label for="destination">Airline</label> <input
								name="airline" type="text" class="form-control"
								id="user_destination" aria-describedby="emailHelp"
								placeholder="Enter your Airline name here">

						</div>
						
						<div class="form-group">
							<label for="destination">Ticket prize</label> <input
								name="ticket" type="number" class="form-control"
								id="ticket" aria-describedby="emailHelp"
								placeholder="Enter your Ticket prize here">

						</div>


						<div class="form-group">
							<label for="date">Date of journy</label> <input name="date"
								type="date" class="form-control" id="date"
								placeholder="Select date">
						</div>




						<br>

						<div class="container text-center">
							<button id="submit-btn" type="submit" class="btn btn-primary ">Save Details</button>
						</div>

					</form>

				</div>


			</div>


		</div>



	</main>


	<!-- Save flights ends here  -->

</body>
</html>