package com.tcs.spring.Student2AnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Student {

    private String name = "Mr Mango";
    private int age = 21;

    @Autowired
    private MessageService messageService;

    @Autowired
    private EmailService emailService;

    public void details() {
        System.out.println("Student Details and Services:");
        System.out.println("Name: " + name);
        System.out.println("Age: " + age);
        emailService.email();
        messageService.message();
    }
  // you can generate setter and getters here

}
