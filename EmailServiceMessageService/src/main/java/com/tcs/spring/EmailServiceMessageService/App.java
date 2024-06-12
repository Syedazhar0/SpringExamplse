package com.tcs.spring.EmailServiceMessageService;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
    	ApplicationContext context = new AnnotationConfigApplicationContext(JavaConfig.class);
    	Student student = (Student) context.getBean("student");
    	student.details();
        System.out.println( "Hello World!" );
    }
}
