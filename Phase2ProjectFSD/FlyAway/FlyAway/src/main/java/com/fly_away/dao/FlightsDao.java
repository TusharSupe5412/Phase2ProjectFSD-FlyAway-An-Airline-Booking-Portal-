package com.fly_away.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

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
			
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
}
		return f;
	}
	
	
//	Get flight Details by source,destination and date
	
	
	public Flights FlightDetailsBtSourceDestAndDate() {
		return null;
		
		
	}
	
	
	
	
	
	

}
