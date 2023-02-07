package com.ics499.team2.clothingstore.controllers;

//@author Justin Pham
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AccountController {

	@GetMapping("/account")
	public String test() {
		return "Customer Controller";
	}
}
