package com.tcs.spring.EmailServiceMessageService;

public class EmailService implements Email {

	private String Emailto;
	private String EmailStatus;
	
	public EmailService(String emailto, String emailStatus) {
		super();
		Emailto = emailto;
		EmailStatus = emailStatus;
	}

	public String getEmailto() {
		return Emailto;
	}

	public void setEmailto(String emailto) {
		Emailto = emailto;
	}

	public String getEmailStatus() {
		return EmailStatus;
	}

	public void setEmailStatus(String emailStatus) {
		EmailStatus = emailStatus;
	}
	
	

	public EmailService() {
		super();
	}

	@Override
	public void email() {
		System.out.println("email status");
		System.out.println("emailed to "+Emailto);
		System.out.println("email status "+EmailStatus);
		
	}

}
