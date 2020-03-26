package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloWorld {

	@GetMapping
	@RequestMapping(value="/")
	public String helloWorld(){
		
		return "Hi Pavan";
	}
}
