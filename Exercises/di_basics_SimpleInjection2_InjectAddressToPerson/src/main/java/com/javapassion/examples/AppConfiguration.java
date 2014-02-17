package com.javapassion.examples;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfiguration {
	@Bean
	public Person getPerson() {
		return new Person();
	}
	
	@Bean
	public Address getAddress() {
		return new Address();
	}
}
