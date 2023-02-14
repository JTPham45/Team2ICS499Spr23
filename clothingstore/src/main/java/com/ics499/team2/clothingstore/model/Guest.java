package com.ics499.team2.clothingstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Guest extends User {

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)

	@Id
	@GeneratedValue
	public long sessionId = 0;

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
