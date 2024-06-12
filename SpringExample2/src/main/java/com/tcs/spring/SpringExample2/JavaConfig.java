package com.tcs.spring.SpringExample2;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {

	@Bean("greet")
	public GreetingImpl greet() {
		GreetingImpl greetingImpl = new GreetingImpl();
		return greetingImpl;
	}
	
}
