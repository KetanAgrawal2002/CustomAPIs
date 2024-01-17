package com.example.demo.controller;

import java.time.LocalDate;
import java.time.Period;

import org.springframework.format.annotation.DateTimeFormat;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Validator {
	@GetMapping("/calculateAge")
	public String calculateAge(@RequestParam("dob") @DateTimeFormat(iso = DateTimeFormat.ISO.DATE) LocalDate dob) {
	    LocalDate currentDate = LocalDate.now();
	    Period period = Period.between(dob, currentDate);
	    int age = period.getYears();
	    return "Your age is: " + age + " years";
	}
}

