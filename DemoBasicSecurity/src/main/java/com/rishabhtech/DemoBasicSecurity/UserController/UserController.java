package com.rishabhtech.DemoBasicSecurity.UserController;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {
	
	@GetMapping("")
	public String getHomePage() {
		// Add your logic here
		return("<h1>Welcome to Homepage</h1>");
	}
}
