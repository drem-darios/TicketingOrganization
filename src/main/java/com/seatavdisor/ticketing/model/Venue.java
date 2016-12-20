package com.seatavdisor.ticketing.model;

public class Venue {
	// Only store the name of the Venue for now. Later we can store things like address
	private String name; 
	
	public Venue(String name) {
		this.name = name;
	}

	public String getName() {
		return name;
	}
	
}
