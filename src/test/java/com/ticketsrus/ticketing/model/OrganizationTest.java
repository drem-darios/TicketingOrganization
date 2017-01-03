package com.ticketsrus.ticketing.model;

import java.util.Date;

import org.junit.Test;

import com.ticketsrus.ticketing.api.OrgCategory;
import com.ticketsrus.ticketing.model.Event;
import com.ticketsrus.ticketing.model.Organization;
import com.ticketsrus.ticketing.model.Performance;
import com.ticketsrus.ticketing.model.Venue;

public class OrganizationTest {

	@Test
	public void testBuildOrg() {
		Organization org = new Organization("Del Mar Fairgrounds", OrgCategory.SPORTS);
		Performance performance = new Performance(new Date(), new Date(), 1000);
		Venue venue = new Venue("Del Mar Racetrack");
		Event event = new Event("Openning Day", "https://dmtc.com", performance, venue);
		org.addEvent(event);
		
		System.out.println("Org: " + org.getName());
		System.out.println("Category: " + org.getCategory());
		for (Event ev: org.getEvents()) {
			System.out.println("Event: " + ev.getTitle());
			System.out.println("URL: " + ev.getUrl());
			for (Performance perf: ev.getPerformances()) {
				Venue ven = ev.getVenue(perf);
				System.out.println("Venue: " + ven.getName());
				System.out.println("Performance start: " + perf.getStartTime());
				System.out.println("Performance end: " + perf.getEndTime());
				System.out.println("Performance capacity: " + perf.getCapacity());
			}
		}
	}

}
