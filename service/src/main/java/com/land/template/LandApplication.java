package com.land.template;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan({ "com.land.template", "com.land.base" })
public class LandApplication {

	public static void main(String[] args) {
		SpringApplication.run(LandApplication.class, args);
	}

}
