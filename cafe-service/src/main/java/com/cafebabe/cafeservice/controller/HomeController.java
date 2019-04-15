package com.cafebabe.cafeservice.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HomeController {

	@Autowired
	RestTemplate restTemplate;
	
	@GetMapping("/welcome")
	public String test() {
		return "welcome to cafe";
	}
	
	@GetMapping("/")
	public String check() {
		return "Ready";
	}
	
	@GetMapping("/testsearch")
	public String testSearch() {
		String res = restTemplate.getForObject("/search/query", String.class);
		return "cafe to search: "+res;
	}
	
	
}
