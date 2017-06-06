package com.example.demo;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {

	@RequestMapping("/")
	public String say(){
		return "This is Radhika";
		
	}
	
	@RequestMapping("/heroku")
	public String heroku(){
		return "This is my heroku app";
		
	}
	
}
