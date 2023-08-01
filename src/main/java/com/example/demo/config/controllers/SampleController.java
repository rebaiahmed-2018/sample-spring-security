package com.example.demo.config.controllers;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("")
public class SampleController {

	@GetMapping
	public String sayHello() {
		return "Hello world";
	}

	@GetMapping("/bye")
	public String sayGoodbye() {
		return "Goodbye";
	}
}
