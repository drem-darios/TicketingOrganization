package com.seatavdisor.ticketing.model;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

/**
 * Events have a title, a marketing URL, and one or more performances.
 * <code>Performance</code> can be at the same or multiple <code>Venue</code>
 * A given <code>Performance</code> must be performed only at a single <code>Venue</code>
 * @author drem
 *
 */
public class Event {

	private String title;
	private String url;
	private Map<Performance, Venue> performances = new HashMap<Performance, Venue>(); // Maps unique Performance to one Venue
	
	public Event(String title, String url, Performance performance, Venue venue) {
		this.title = title;
		this.url = url;
		addPerformance(performance, venue); // Requires at least one Performance
	}
	
	public void addPerformance(Performance performance, Venue venue) {
		performances.put(performance, venue); // Override any existing Performance
	}
	
	public void removePerformance(Performance performance) {
		performances.remove(performance);
	}
	
	public String getTitle() {
		return title;
	}
	
	public String getUrl() {
		return url;
	}
	
	/**
	 * Returns the <code>Venue</code> where the given <code>Performance</code> will be performed
	 */
	public Venue getVenue(Performance performance) {
		return performances.get(performance);
	}
	
	/**
	 * Returns Collection of <code>Performance</code> for this <code>Event</code>
	 */
	public Collection<Performance> getPerformances() {
		return performances.keySet();
	}
}
