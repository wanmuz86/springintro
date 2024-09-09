package com.example.springintro.service;

import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope("prototype")
public class HelloWorldService {
	
	private final MessageService messageService;
	
	// Dependency Injection
	// Constructor Injection
	
	// To create HelloWorldService, MessageService needs to be created
	public HelloWorldService(MessageService messageService) {
		this.messageService = messageService;
	}
	
	// Modify the sayHello to get it from MessageService
	
	public String sayHello() {
		return messageService.getMessage();
	}

}
