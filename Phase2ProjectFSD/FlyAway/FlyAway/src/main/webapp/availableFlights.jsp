<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@page import="java.sql.*"%>
<%@page import="com.fly_away.helper.*"%>
<%@page import="com.fly_away.entities.*"%>
<%@page import="com.fly_away.dao.*"%>
<%@page import="com.fly_away.servlets.*"%>
<%@page import="java.util.*"%>

<%
ArrayList<Flights> listOfFlights = (ArrayList<Flights>) request.getAttribute("allFlightsDetails");
%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Available Flights</title>
<link rel="stylesheet"
	href="https://cdn.jsdelivr.net/npm/bootstrap@4.0.0/dist/css/bootstrap.min.css"
	integrity="sha384-Gn5384xqQ1aoWXA+058RXPxPg6fy4IWvTNh0E263XmFcJlSAwiGgFAW/dAiS6JXm"
	crossorigin="anonymous">
<link href="css/mystyle.css" rel="stylesheet" type="text/css" />
<link rel="stylesheet"
	href="https://cdnjs.cloudflare.com/ajax/libs/font-awesome/4.7.0/css/font-awesome.min.css">
</head>

</head>
<body>

	<!-- Navbar starts here -->

	<%@ include file="navbar.jsp"%>



	<!-- Navbar ends here -->

	<h1 style='text-align: center; color: green;'>Available Flight
		Details :</h1>
	<div class="container">
		<table class="table">
			<thead>

				<tr class="table-success">
					<th scope="col">Flight id</th>
					<th scope="col">Source</th>
					<th scope="col">Destination</th>
					<th scope="col">Date of journey</th>
					<th scope="col">Airline</th>
					<th scope="col">Ticket</th>



				</tr>
			</thead>



			<%
			for (Flights fl : listOfFlights) {
			%>

			<tr>
				<td><%=fl.getFid()%></td>
				<td><%=fl.getSource()%></td>
				<td><%=fl.getDestination()%></td>
				<td><%=fl.getFdate()%></td>
				<td><%=fl.getAirline()%></td>
				<td><%=fl.getTicket()%></td>



				<td>
					<div>
						<a href='BookingServlet?id=+<%=fl.getFid()%>+'>Book Now</a>
					</div>
				</td>
			</tr>

			<%
			}
			%>
		</table>
	</div>


</body>
</html>