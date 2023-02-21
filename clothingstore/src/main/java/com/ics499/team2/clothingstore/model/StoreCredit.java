package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class StoreCredit {

	@Id
	@GeneratedValue
	private long storeCreditId;

	private double storeCredit;

	public StoreCredit(double storeCredit) {
		super();
		this.storeCredit = storeCredit;
	}

	public StoreCredit() {

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
