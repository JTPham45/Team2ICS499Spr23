package com.ics499.team2.clothingstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ReceiptController {

	@GetMapping("/receipt")
	public String test() {
		return "Recepit Controller";
	}
}
