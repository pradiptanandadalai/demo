package com.example.dockerjenkin.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Test {
	
	
	
	@GetMapping("/get")
	public String get() {
		return "working sucessfully";
	}

}
