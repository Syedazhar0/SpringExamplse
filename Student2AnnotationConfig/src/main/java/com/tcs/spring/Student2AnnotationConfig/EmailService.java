package com.tcs.spring.Student2AnnotationConfig;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Component;

@Component
public class EmailService implements Email {
// or you can add data using this @Value("${email.to:mango@example.com}")
	@Value("${email.to:mango@example.com}")
	private String emailTo;
//    private final String emailTo = "Mango";
    private final String emailStatus = "Email send successfully";

    @Override
    public void email() {
        System.out.println("Email Status:");
        System.out.println("Emailed to " + emailTo);
        System.out.println("Email Status: " + emailStatus);
    }
}
