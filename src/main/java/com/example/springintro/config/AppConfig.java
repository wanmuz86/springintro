package com.example.springintro.config;

//import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

//import com.example.springintro.service.HelloWorldService;
//import com.example.springintro.service.MessageService;

// Annotation to inform Spring that this is the configuration file

@Configuration
@ComponentScan(basePackages="com.example.springintro.service")
public class AppConfig {
	
//	
//	// Declare manually that this project will have a BEAN - HelloWorldService
//	// A Bean is a class that is going managed (construction, destruction, DI)
//	// by Spring
//	
//	@Bean
//	public HelloWorldService helloWorldService(){
//		return new HelloWorldService(messageService());
//	}
//	
//	
//	// Declare manually that this project will have a BEAN - MessageService
//	@Bean 
//	public MessageService messageService() {
//		return new MessageService();
//	}

}
