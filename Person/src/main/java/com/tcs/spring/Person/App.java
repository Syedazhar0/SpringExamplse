package com.tcs.spring.Person;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Person person = (Person) context.getBean("details");
    	person.display();
        System.out.println( "Hello World!" );
    }
}
