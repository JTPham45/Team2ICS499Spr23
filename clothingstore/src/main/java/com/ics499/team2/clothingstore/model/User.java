package com.ics499.team2.clothingstore.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Inheritance;
import javax.persistence.InheritanceType;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.Table;

@Entity
@Table(name = "users")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public class User {

	@JoinTable(

			name = "CustomerAccounts", joinColumns = @JoinColumn(name = "customerId"), inverseJoinColumns = @JoinColumn(name = "userId"))

	@Id
	@GeneratedValue
	private long customerId;
}
