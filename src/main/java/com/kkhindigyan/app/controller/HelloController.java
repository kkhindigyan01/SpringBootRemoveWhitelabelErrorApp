package com.kkhindigyan.app.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
	
	@GetMapping(path = "/welcome")
	public String welcome() {
		return "Welcome to Restful World!!";
	}
}
