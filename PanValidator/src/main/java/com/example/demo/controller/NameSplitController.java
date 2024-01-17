package com.example.demo.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.DTO.Name;

@RestController
public class NameSplitController {
	
	@GetMapping("/splitname")
	public Name splitName(@RequestParam("fullName") String fullName) {
		Name name = new Name();
		String[] strArray = fullName.split(" ");
		name.setFirstName(strArray[0]);
		name.setLastName(strArray[1]);
		return name;
	}
	
}
