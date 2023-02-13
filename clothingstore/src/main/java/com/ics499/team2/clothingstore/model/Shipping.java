package com.ics499.team2.clothingstore.model;

public class Shipping {
	private String shipToAddress;
	private double shippingCosts = 9.99;

	public Shipping(String shipToAddress, double shippingCosts) {
		super();
		this.shipToAddress = shipToAddress;
		this.shippingCosts = shippingCosts;
	}

	public double addShipping() {
		return shippingCosts;// ?? not sure what this method should do - Justin
	}

	public void checkForFreeShipping(boolean b) {
		if (b == true) {
			this.shippingCosts = 0;
		}
	}

	public String getShipToAddress() {
		return shipToAddress;
	}

	public void setShipToAddress(String shipToAddress) {
		this.shipToAddress = shipToAddress;
	}

	public double getShippingCosts() {
		return shippingCosts;
	}

	public void setShippingCosts(double shippingCosts) {
		this.shippingCosts = shippingCosts;
	}

}
