package com.ics499.team2.clothingstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TransactionController {
	@GetMapping("/transaction")
	public String test() {
		return "Transaction Controller";
	}
}
