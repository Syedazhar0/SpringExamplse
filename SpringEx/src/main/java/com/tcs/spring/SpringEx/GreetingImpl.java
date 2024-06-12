package com.tcs.spring.SpringEx;

public class GreetingImpl implements Greeting {

	@Override
	public void greet() {
	
		System.out.println("this is spring first example");
		System.out.println("welcome to spring framework");
		
	}
	
	private  GreetingImpl() {
		System.out.println("object created successfully ......... constructor called successfully");
	}
		

	}

