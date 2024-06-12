package com.tcs.spring.SpringEx;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class App 
{
	private static ApplicationContext context;
    public static void main( String[] args )
    {
    	// note: if the ClassPathXmlApplicationContext("spring.xml"); not reading directly then
    	//provide complete package name in which the file is present as shown below
    	context = new ClassPathXmlApplicationContext("com/tcs/spring/SpringEx/spring.xml");
    	GreetingImpl greetingImpl = (GreetingImpl) context.getBean("greet", GreetingImpl.class) ;
    	greetingImpl.greet();
        System.out.println( "Hello World!" );
    }
}
