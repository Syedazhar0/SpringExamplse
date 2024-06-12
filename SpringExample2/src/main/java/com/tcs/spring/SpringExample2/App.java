package com.tcs.spring.SpringExample2;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greet");
    	greetingImpl.greet();
    }

}
