package com.tcs.spring.EmailServiceMessageService;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class JavaConfig {
	
	@Bean("email")
	public EmailService emailService() {
		EmailService emailService = new EmailService();
		emailService.setEmailStatus("Email send successfully");
		emailService.setEmailto("Mango");
		return emailService;
	}
	
	@Bean("mango")
	public MessageService messageService() {
		MessageService messageService = new MessageService();
		messageService.setMsgType("Message type is Text");
		messageService.setMessage("Hello Mango");
		return messageService;
	}
	
	@Bean("student")
	public Student student() {
    Student student = new Student();
    student.setName("Apple");
    student.setAge(0);
   student.setEmailService(emailService());
   student.setMessageService(messageService());
	return student;
	}
}
