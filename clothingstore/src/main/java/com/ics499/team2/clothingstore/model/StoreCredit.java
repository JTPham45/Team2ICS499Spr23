package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;

@Entity
public class StoreCredit {

	private double storeCredit;

	public StoreCredit(double storeCredit) {
		super();
		this.storeCredit = storeCredit;
	}

	public double getStoreCredit() {
		return storeCredit;
	}

	public void setStoreCredit(double storeCredit) {
		this.storeCredit = storeCredit;
	}

	public void addToStoreCredit(double amount) {
		this.storeCredit += amount;
	}

	public void removeStoreCredit(double amount) {
		this.storeCredit = +amount;
	}

}
