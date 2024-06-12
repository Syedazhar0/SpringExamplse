package com.tcs.spring.EmailServiceMessageService;

public class Student {
private String Name;
private int age;
MessageService  messageService;
EmailService emailService;

public Student(String name, int age, MessageService messageService, EmailService emailService) {
	super();
	Name = name;
	this.age = age;
	this.messageService = messageService;
	this.emailService = emailService;
}

public Student() {
	super();
}

public String getName() {
	return Name;
}

public void setName(String name) {
	Name = name;
}

public int getAge() {
	return age;
}

public void setAge(int age) {
	this.age = age;
}

public MessageService getMessageService() {
	return messageService;
}

public void setMessageService(MessageService messageService) {
	this.messageService = messageService;
}

public EmailService getEmailService() {
	return emailService;
}

public void setEmailService(EmailService emailService) {
	this.emailService = emailService;
}

public void details() {
	System.out.println("Student Details and services");
	emailService.email();
	messageService.message();
}
}
