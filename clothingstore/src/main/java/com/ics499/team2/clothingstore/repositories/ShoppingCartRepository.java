package com.ics499.team2.clothingstore.repositories;

import org.springframework.data.jpa.repository.JpaRepository;

import com.ics499.team2.clothingstore.model.ShoppingCart;

public interface ShoppingCartRepository extends JpaRepository<ShoppingCart, Long>{

}
