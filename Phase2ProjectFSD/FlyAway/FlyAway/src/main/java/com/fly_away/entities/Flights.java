package com.fly_away.entities;

import java.util.Date;

public class Flights {

	private int fid;
	private String source;
	private String destination;
	private String airline;
	private String ticket;
	private String fdate;
	
	
	public Flights(int fid, String source, String destination, String airline, String ticket, String fdate) {
		super();
		this.fid = fid;
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.ticket = ticket;
		this.fdate = fdate;
	}


	public Flights(String source, String destination, String airline, String ticket, String fdate) {
		super();
		this.source = source;
		this.destination = destination;
		this.airline = airline;
		this.ticket = ticket;
		this.fdate = fdate;
	}


	public Flights() {
		super();
		// TODO Auto-generated constructor stub
	}
	
	
							//	Getters and Setters


	


	


	public int getFid() {
		return fid;
	}


	public void setFid(int fid) {
		this.fid = fid;
	}

	public String getSource() {
		return source;
	}

	public void setSource(String source) {
		this.source = source;
	}


	public String getDestination() {
		return destination;
	}


	public void setDestination(String destination) {
		this.destination = destination;
	}


	public String getAirline() {
		return airline;
	}


	public void setAirline(String airline) {
		this.airline = airline;
	}


	public String getTicket() {
		return ticket;
	}


	public void setTicket(String ticket) {
		this.ticket = ticket;
	}


	public String getFdate() {
		return fdate;
	}


	public void setFdate(String fdate) {
		this.fdate = fdate;
	}
	
	
	
	
	
}
