package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;

@Entity
public class Shirt extends Product {

	public Shirt(float price, int stock, String description, String brand, String color, String size, String fit) {
		super(price, stock, description, brand, color, size, fit);
		// TODO Auto-generated constructor stub
	}
	public Shirt() {
		
	}

}
