package com.ics499.team2.clothingstore.model;

public class Guest extends Customer {
	public static long sessionId = 0;

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
