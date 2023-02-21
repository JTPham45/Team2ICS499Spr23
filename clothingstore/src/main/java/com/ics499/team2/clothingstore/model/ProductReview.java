package com.ics499.team2.clothingstore.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

@Entity
@Table(name = "reviews")
public class ProductReview {

	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "reviews", joinColumns = @JoinColumn(name = "reviewId"), inverseJoinColumns = @JoinColumn(name = "productId"))
	@Id
	@GeneratedValue
	private long reviewId;

	private Product product;
	private int rating;
	private long userAccountID;
	private String review;

	public ProductReview(Product product, int rating, long userAccountID, String review) {
		super();
		this.product = product;
		this.rating = rating;
		this.userAccountID = userAccountID;
		this.review = review;
	}

	public ProductReview() {

	}

	public Product getProduct() {
		return product;
	}

	public void setProduct(Product product) {
		this.product = product;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public long getUserAccountID() {
		return userAccountID;
	}

	public void setUserAccountID(long userAccountID) {
		this.userAccountID = userAccountID;
	}

	public String getReview() {// these two are the same as show review and make review
		return review;
	}

	public void setReview(String review) {
		this.review = review;
	}

	@Override
	public String toString() {
		return "ProductReview [product=" + product + ", rating=" + rating + ", userAccountID=" + userAccountID
				+ ", review=" + review + "]";
	}

}
