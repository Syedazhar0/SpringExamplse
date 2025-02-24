package com.tcs.spring;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App {
    public static void main(String[] args) {
        // Load the Spring config file
        ApplicationContext context = new ClassPathXmlApplicationContext("com/tcs/spring/spring.xml");

        // Retrieve the Traveller bean from the context
        Traveller traveller = context.getBean("traveller", Traveller.class);

        // Display details of the traveller
        traveller.travellerDetails();
    }
}
