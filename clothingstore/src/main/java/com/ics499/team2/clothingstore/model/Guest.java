package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;

@Entity
public class Guest extends User {

	@GeneratedValue
	private long sessionId = 0;

	public Guest() {
		createId();
	}

	public long createId() {
		return sessionId++;
	}

	@Override
	public String toString() {
		return "Guest: " + sessionId;
	}

}
