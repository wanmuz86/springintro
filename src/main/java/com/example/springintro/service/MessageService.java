package com.example.springintro.service;

import org.springframework.stereotype.Component;

@Component
public class MessageService {
	
	public String getMessage() {
		
		return "Welcome to Spring Dependency Management";
	}

}
