package com.ics499.team2.clothingstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ics499.team2.clothingstore.model.Customer;

public interface AccountRepository extends JpaRepository<Customer, Long> {

}
