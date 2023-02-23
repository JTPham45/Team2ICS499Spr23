package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;

@Entity
public class Hat extends Product {

	public Hat(float price, int stock, String description, String brand, String color, String size, String fit) {
		super(price, stock, description, brand, color, size, fit);
		// TODO Auto-generated constructor stub
	}
	public Hat() {
		
	}
}
