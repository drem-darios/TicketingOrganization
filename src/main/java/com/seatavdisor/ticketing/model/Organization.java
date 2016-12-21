package com.seatavdisor.ticketing.model;

import java.util.ArrayList;
import java.util.Collection;

import com.seatavdisor.ticketing.api.OrgCategory;

/**
 * An <code>Organization</code> can sell tickets or host <code>Event</code>
 * Organizations commonly belong to an <code>OrgCategory</code>
 * @author drem
 *
 */
public class Organization {

	private String name;
	private OrgCategory category;
	private Collection<Event> events = new ArrayList<Event>();
	
	public Organization(String name, OrgCategory category) {
		this.name = name;
		this.category = category;
	}

	public String getName() {
		return name;
	}
	public Collection<Event> getEvents() {
		return events;
	}

	public OrgCategory getCategory() {
		return category;
	}
	
	public void setCategory(OrgCategory category) { 
		this.category = category;
	}

	public boolean addEvent(Event event) {
		return events.add(event);
	}
	
	public boolean removeEvent(Event event) {
		return events.remove(event);
	}
	
}
