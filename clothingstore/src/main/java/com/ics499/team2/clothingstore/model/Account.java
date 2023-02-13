package com.ics499.team2.clothingstore.model;

import java.util.Date;
import java.util.List;

public class Account extends Customer {
	private String address;
	private String city;
	private String state;
	private String phoneNumber;
	private Date dateAccountCreated;
	private List<Transaction> transactionHistory;
	private static long accountId = 0;

	public Account(String address, String city, String state, String phoneNumber, Date dateAccountCreated,
			List<Transaction> transactionHistory) {
		super();
		this.address = address;
		this.city = city;
		this.state = state;
		this.phoneNumber = phoneNumber;
		this.dateAccountCreated = dateAccountCreated;
		this.transactionHistory = transactionHistory;
		accountId = createId();
	}

	/**
	 * used to create a unique ID each time a class is created.
	 * 
	 * @return
	 */
	public static synchronized long createId() {
		return accountId++;
	}

	public void addTransactionToHistory(Transaction t) {
		this.transactionHistory.add(t);
	}

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public Date getDateAccountCreated() {
		return dateAccountCreated;
	}

	public void setDateAccountCreated(Date dateAccountCreated) {
		this.dateAccountCreated = dateAccountCreated;
	}

	public List<Transaction> getTransactionHistory() {
		return transactionHistory;
	}

	public void setTransactionHistory(List<Transaction> transactionHistory) {
		this.transactionHistory = transactionHistory;
	}

	@Override
	public String toString() {
		return "Account [address=" + address + ", city=" + city + ", state=" + state + ", phoneNumber=" + phoneNumber
				+ ", dateAccountCreated=" + dateAccountCreated + ", transactionHistory=" + transactionHistory + "]";
	}

}
