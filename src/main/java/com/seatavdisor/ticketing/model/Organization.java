package com.seatavdisor.ticketing.model;

import java.util.ArrayList;
import java.util.Collection;

import com.seatavdisor.ticketing.api.OrgCategory;

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
