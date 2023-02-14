package com.ics499.team2.clothingstore.model;

import java.util.List;

public class ShoppingCart {
	private List<Product> products;
	private long userAccountId;
	private static long cartId = 0;

	public ShoppingCart(long userAccountId) {
		super();
		this.userAccountId = userAccountId;
		cartId = createCartId();
	}

	public void addProduct(Product p) {
		products.add(p);
	}

	public void removeProduct(Product p) {
		products.remove(p);
	}

	public long timeToLive() {
		return 0;
	}

	public List<Product> getProducts() {
		return products;
	}

	public void setProducts(List<Product> products) {
		this.products = products;
	}

	public long getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(long userAccountId) {
		this.userAccountId = userAccountId;
	}

	public static long getCartId() {
		return cartId;
	}

	public static synchronized long createCartId() {
		return cartId++;
	}

	@Override
	public String toString() {
		return "ShoppingCart [products=" + products + ", userAccountId=" + userAccountId + "]";
	}

}
