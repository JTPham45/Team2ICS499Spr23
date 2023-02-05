package com.ics499.team2.clothingstore.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ProductReviewController {
	@GetMapping("/productReview")
	public String test() {
		return "Product Review Controller";

	}

}
