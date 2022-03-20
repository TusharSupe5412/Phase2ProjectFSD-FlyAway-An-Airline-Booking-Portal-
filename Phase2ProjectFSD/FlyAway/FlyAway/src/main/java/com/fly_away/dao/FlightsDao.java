package com.fly_away.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

import com.fly_away.entities.Flights;

public class FlightsDao {

	private Connection con;

	public FlightsDao(Connection con) {
		super();
		this.con = con;
	}

//	Save user to DB.....

	public boolean saveFlights(Flights flights) {

		boolean f = false;

		try {

			String query = "insert into flights(source,destination,airline,ticket,fdate) values(?,?,?,?,?)";

			PreparedStatement pstmt = this.con.prepareStatement(query);

			pstmt.setString(1, flights.getSource());
			pstmt.setString(2, flights.getDestination());
			pstmt.setString(3, flights.getAirline());
			pstmt.setString(4, flights.getTicket());
			pstmt.setString(5, flights.getFdate());

			pstmt.executeUpdate();

			f = true;

		} catch (Exception e) {
			e.printStackTrace();
		}
		return f;
	}

//	Get flight Details by source,destination and date

	public ArrayList<Flights> getAllFlights() {

		ArrayList<Flights> listOfFlights = new ArrayList<Flights>();

		try {

			String query = "Select * from Flights";

			Statement pstmt = con.createStatement();

			ResultSet set = pstmt.executeQuery(query);

			while (set.next()) {
				Flights f = new Flights();
				f.setFid(set.getInt(1));
				f.setSource((set.getString(2)));
				f.setDestination(set.getString(3));
				f.setAirline(set.getString(4));
				f.setTicket(set.getString(5));
				f.setFdate(set.getString(6));

				listOfFlights.add(f);
			}

//			request.setAttribut("ListOfFlights",f);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listOfFlights;

	}

//	Get flight Details by source,destination and date

	public ArrayList<Flights> getAvailableFlights(String source, String destination, String date) {

		ArrayList<Flights> listOfFlights = new ArrayList<Flights>();

		try {

			String query = "Select * from Flights where source= ? and destination= ? and fdate= ?;";

			PreparedStatement pstmt = con.prepareStatement(query);
			
			pstmt.setString(1, source);
			pstmt.setString(2, destination);
			pstmt.setString(3, date);

			ResultSet set = pstmt.executeQuery();

			while (set.next()) {
				Flights f = new Flights();
				
				f.setSource((set.getString(2)));
				f.setDestination(set.getString(3));
				f.setAirline(set.getString(4));
				f.setTicket(set.getString(5));
				f.setFdate(set.getString(6));

				listOfFlights.add(f);
			}

//			request.setAttribut("ListOfFlights",f);

		} catch (Exception e) {
			e.printStackTrace();
		}

		return listOfFlights;

	}
	
	
	
//	    Get flight Details by fid
	
	
	
public Flights getFlightsByFid(int fid) {
		
		Flights flights = null;
		
		
		
		
		try {
			String q = "Select * from Flights where fid=?";	
			PreparedStatement ps = this.con.prepareStatement(q);
			ps.setInt(1, fid);
			
			ResultSet set = ps.executeQuery();
			
			while(set.next()) {
				Flights f = new Flights();
				f.setSource(set.getString(2));
				f.setDestination(set.getString(3));
				f.setAirline(set.getString(4));
				f.setTicket(set.getString(5));
				f.setFdate(set.getString(6));
		
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
		return flights;
}
}
