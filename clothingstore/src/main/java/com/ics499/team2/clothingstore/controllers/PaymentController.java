package com.ics499.team2.clothingstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class PaymentController {
	@GetMapping("/Payment")
	public String test() {
		return "Transaction Controller";
	}
}
