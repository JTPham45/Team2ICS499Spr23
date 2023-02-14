package com.ics499.team2.clothingstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;

public class RewardsController {
	@GetMapping("/Rewards")
	public String test() {
		return "Transaction Controller";
		// Tom test 
	}
}
