package com.fly_away.dao;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;

import com.fly_away.entities.Flites;


public class FlitesDao {
	
	private Connection con;

	public FlitesDao(Connection con) {
		super();
		this.con = con;
	}
	
	public boolean saveFlites(Flites flites) {
		
		boolean f = false;
		
		try {
			
			String query = "insert into flites(source,destination,airline,ticket,fdate) values(?,?,?,?,?)";
			
			PreparedStatement pstmt = this.con.prepareStatement(query);
			
			pstmt.setString(1, flites.getSource());
			pstmt.setString(2, flites.getDestination());
			pstmt.setString(3, flites.getAirline());
			pstmt.setString(4, flites.getTicket());
			pstmt.setString(5, flites.getFdate());
			
			pstmt.executeUpdate();
			
			f=true;
			
		} catch (Exception e) {
			e.printStackTrace();
}
		
		
		
		return f;
		
	}

}
