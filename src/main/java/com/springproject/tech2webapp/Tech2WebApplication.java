package com.springproject.tech2webapp;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;

@SpringBootApplication
public class Tech2WebApplication extends SpringBootServletInitializer {

	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Tech2WebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Tech2WebApplication.class, args);
	}

}
