package com.ics499.team2.clothingstore.model;

import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name = "shoppingcarts")
public class ShoppingCart {

	@OneToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "shoppingCart", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "shoppingCartId"))
	@Id
	@GeneratedValue
	private long shoppingCartId;

	private List<Product> products;
	private long userAccountId;
	private static long cartId = 0;

	public ShoppingCart(long userAccountId) {
		super();
		this.userAccountId = userAccountId;
		cartId = createCartId();
	}
	ShoppingCart(){
		
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
