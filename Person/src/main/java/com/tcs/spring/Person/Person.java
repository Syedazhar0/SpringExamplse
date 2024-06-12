package com.tcs.spring.Person;

public class Person {
private String Name;
private String Email;
public Person(String name, String email) {
	super();
	Name = name;
	Email = email;
}
public String getName() {
	return Name;
}
public void setName(String name) {
	Name = name;
}
public String getEmail() {
	return Email;
}
public void setEmail(String email) {
	Email = email;
}
public void display() {
	System.out.println("your name is :"+Name);
	System.out.println("your email id is :"+Email);
}
public Person() {
	super();
}

}
