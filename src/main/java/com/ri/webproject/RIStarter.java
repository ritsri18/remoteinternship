package com.ri.webproject;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class RIStarter extends SpringBootServletInitializer {

    @Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
    	System.out.println("Remore Internship Web Project Initialized via Web Server");
    	return application.sources(RIStarter.class);
    }

    public static void main(String[] args) {
		SpringApplication.run(RIStarter.class, args);
		System.out.println("Remore Internship Web Project Initialized as MicroService");
	}
    
}
