package com.ics499.team2.clothingstore;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {
	@GetMapping("/Hello")
	public String helloWorld() {
		return "Hello World";
	}

}