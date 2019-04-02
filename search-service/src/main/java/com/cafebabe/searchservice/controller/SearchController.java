package com.cafebabe.searchservice.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("search")
public class SearchController {

	@GetMapping("/query")
	public String testSearch() {
		return "Are you searching for something?";
	}
	
	@GetMapping("/")
	public String check() {
		return "Ready to search";
	}
}
