package com.example.demo.controller;

import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	
	@GetMapping("/get")
	public void getDetails() {
		System.out.println("Get Details successfully..!");
	}
	
	@PostMapping("/save")
	public void saveDetails() {
		System.out.println("Details saved successfully...!");
	}
	
	@DeleteMapping("/delete")
	public void delete() {
		System.out.println("Details deleted successfully..!");
	}
	
	
}
