package com.seatavdisor.ticketing.model;

/**
 * A <code>Venue</code> is the location where a <code>Performance</code> will take place.
 * @author drem
 *
 */
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
