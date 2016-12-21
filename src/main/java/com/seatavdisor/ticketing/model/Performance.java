package com.seatavdisor.ticketing.model;

import java.util.Date;

/**
 * A <code>Performance</code> begins at a specific time and lasts for a pre-defined time period.
 * A performance has a maximum capacity
 * @author drem
 *
 */
public class Performance {

	private Date startTime; // Start time
	private Date endTime; // End time (duration can be derived)
	private int capacity; // Maximum number of patrons
	
	public Performance(Date start, Date end, int capacity) {
		this.startTime = start;
		this.endTime = end;
		this.capacity = capacity;
	}
	
	public Date getStartTime() {
		return startTime;
	}
	
	public Date getEndTime() {
		return endTime;
	}
	
	public int getCapacity() {
		return capacity;
	}
	
	public void setCapacity(int capacity) {
		this.capacity = capacity; // Allow the capacity to change
	}
	
}
