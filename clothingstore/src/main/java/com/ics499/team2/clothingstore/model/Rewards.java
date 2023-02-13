package com.ics499.team2.clothingstore.model;

public class Rewards {
	private int currentPoints;
	private int redeemedPoints;
	private int accountLifespanPoints;

	public Rewards(int currentPoints, int redeemedPoints, int accountLifespanPoints) {
		super();
		this.currentPoints = currentPoints;
		this.redeemedPoints = redeemedPoints;
		this.accountLifespanPoints = accountLifespanPoints;
	}

	public Product whatToRedeem() {
		return null;
	}

	public int getCurrentPoints() {
		return currentPoints;
	}

	public void setCurrentPoints(int currentPoints) {
		this.currentPoints = currentPoints;
	}

	public int getRedeemedPoints() {
		return redeemedPoints;
	}

	public void setRedeemedPoints(int redeemedPoints) {
		this.redeemedPoints = redeemedPoints;
	}

	public int getAccountLifespanPoints() {
		return accountLifespanPoints;
	}

	public void setAccountLifespanPoints(int accountLifespanPoints) {
		this.accountLifespanPoints = accountLifespanPoints;
	}

	@Override
	public String toString() {
		return "Rewards [currentPoints=" + currentPoints + ", redeemedPoints=" + redeemedPoints
				+ ", accountLifespanPoints=" + accountLifespanPoints + "]";
	}

}
