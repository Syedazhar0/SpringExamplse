package com.tcs.spring.Student2AnnotationConfig;

import org.springframework.stereotype.Component;

@Component
public class MessageService implements Message {

    private final String msgType = "Message type is Text";
    private final String message = "Hello Mango";

    @Override
    public void message() {
        System.out.println("Message Status:");
        System.out.println("Message Type: " + msgType);
        System.out.println("Message: " + message);
    }
}