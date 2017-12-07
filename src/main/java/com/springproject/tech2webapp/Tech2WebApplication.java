package com.springproject.tech2webapp;

import com.springproject.tech2webapp.controller.IndexController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan(basePackageClasses=IndexController.class)
public class Tech2WebApplication extends SpringBootServletInitializer {


	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
		return application.sources(Tech2WebApplication.class);
	}

	public static void main(String[] args) throws Exception {
		SpringApplication.run(Tech2WebApplication.class, args);
	}

}
