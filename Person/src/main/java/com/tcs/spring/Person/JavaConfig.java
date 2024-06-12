package com.tcs.spring.Person;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean("details")
	public Person person() {
		
		Person person = new Person();
		person.setName("Mango");
		person.setEmail("Mango@gmail.com");
		return person;
	}
	
	@Bean("details1")
	public Person person1() {
		
		Person person = new Person();
		person.setName("Apple");
		person.setEmail("Apple@gmail.com");
		return person;
	}
	
}
