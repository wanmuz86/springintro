package com.example.springintro;

import com.example.springintro.config.AppConfig;
import com.example.springintro.service.HelloWorldService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // Create a context....
    	// A container that contains all the Bean created by Spring
    	// two ways of defining -  AnnotationConfig, XMLConfigApplicationContext
    	ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
    	
    	// Look for the Bean/Class that can be used to instatiate HelloWorlService
    	// And instatiate it
    	// Polymorphism (interface)
    	// eg: Animal animal = context.getBean(Dog.class);
    	// eg: DBConnection dbConnect = context.getBean(HibernateConnection.clss), JPAConnection
    	// Loose coupling in Java/ Spring java
    	
    	HelloWorldService service = context.getBean(HelloWorldService.class);
    	
    	HelloWorldService service2 = context.getBean(HelloWorldService.class);
    	
    	System.out.println(service.sayHello());
    	
    	boolean isTheSameInstance= service == service2;
    	// By default this will return true, because a bean by default is a singleton class
    	// one object per context/per container
    	
    	System.out.println("Is service 1 and service2 the same istance? "+isTheSameInstance);
    	
    	
    	((AnnotationConfigApplicationContext)context).close(); 
    	// close the context/destroy/ close the connexction
   
    }
}
