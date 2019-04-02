package com.cafebabe.cafeservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HomeController {

	@GetMapping("/welcome")
	public String test() {
		return "welcome to cafe";
	}
	
	@GetMapping("/")
	public String check() {
		return "Ready";
	}
}
