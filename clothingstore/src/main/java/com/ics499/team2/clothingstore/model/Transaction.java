package com.ics499.team2.clothingstore.model;

import java.util.Date;

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
@Table(name = "Transaction")
public class Transaction implements Payment {
	@ManyToOne(fetch = FetchType.EAGER, cascade = CascadeType.MERGE)
	@JoinTable(name = "userTransactions", joinColumns = @JoinColumn(name = "userId"), inverseJoinColumns = @JoinColumn(name = "transactionId"))
	@Id
	@GeneratedValue
	private long transactionId;
	private String PaymentMethod;// could this be a enum? like Visa, Mastercard, discover?
	private int creditCardNumber;
	private int creditCardCV;
	private Date creditCardExpirationDate;
	private ShoppingCart cart;
	private double total;
	private Date transactionDate;
	private boolean isReturn;// should returns be it's own subclass?
	private long userAccountId;

	public Transaction(String paymentMethod, int creditCardNumber, int creditCardCV, Date creditCardExpirationDate,
			ShoppingCart cart, double total, Date transactionDate, boolean isReturn, long userAccountId) {
		super();
		PaymentMethod = paymentMethod;
		this.creditCardNumber = creditCardNumber;
		this.creditCardCV = creditCardCV;
		this.creditCardExpirationDate = creditCardExpirationDate;
		this.cart = cart;
		this.total = total;
		this.transactionDate = transactionDate;
		this.isReturn = isReturn;
		this.userAccountId = userAccountId;
	}
	public Transaction() {
		
	}
	/**
	 * does this generate and return a PDF as a receipt?
	 */
	public void printReceipt() {

	}

	public String getPaymentMethod() {
		return PaymentMethod;
	}

	public void setPaymentMethod(String paymentMethod) {
		PaymentMethod = paymentMethod;
	}

	public int getCreditCardNumber() {
		return creditCardNumber;
	}

	public void setCreditCardNumber(int creditCardNumber) {
		this.creditCardNumber = creditCardNumber;
	}

	public int getCreditCardCV() {
		return creditCardCV;
	}

	public void setCreditCardCV(int creditCardCV) {
		this.creditCardCV = creditCardCV;
	}

	public Date getCreditCardExpirationDate() {
		return creditCardExpirationDate;
	}

	public void setCreditCardExpirationDate(Date creditCardExpirationDate) {
		this.creditCardExpirationDate = creditCardExpirationDate;
	}

	public ShoppingCart getCart() {
		return cart;
	}

	public void setCart(ShoppingCart cart) {
		this.cart = cart;
	}

	public double getTotal() {
		return total;
	}

	public void setTotal(double total) {
		this.total = total;
	}

	public Date getTransactionDate() {
		return transactionDate;
	}

	public void setTransactionDate(Date transactionDate) {
		this.transactionDate = transactionDate;
	}

	public boolean isReturn() {
		return isReturn;
	}

	public void setReturn(boolean isReturn) {
		this.isReturn = isReturn;
	}

	public long getUserAccountId() {
		return userAccountId;
	}

	public void setUserAccountId(long userAccountId) {
		this.userAccountId = userAccountId;
	}

	@Override
	public String toString() {
		return "Transaction [PaymentMethod=" + PaymentMethod + ", creditCardNumber=" + creditCardNumber
				+ ", creditCardCV=" + creditCardCV + ", creditCardExpirationDate=" + creditCardExpirationDate
				+ ", cart=" + cart + ", total=" + total + ", transactionDate=" + transactionDate + ", isReturn="
				+ isReturn + ", userAccountId=" + userAccountId + "]";
	}

	@Override
	public String doSomeEncrypting() {
		// TODO Auto-generated method stub
		return null;
	}

}
