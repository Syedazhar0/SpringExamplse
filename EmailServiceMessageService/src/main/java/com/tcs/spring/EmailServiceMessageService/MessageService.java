package com.tcs.spring.EmailServiceMessageService;

public class MessageService implements Message {

	private String msgType;
	private String message;
	
	public MessageService(String msgType, String message) {
		super();
		this.msgType = msgType;
		this.message = message;
	}


	public String getMsgType() {
		return msgType;
	}


	public void setMsgType(String msgType) {
		this.msgType = msgType;
	}

	public String getMessage() {
		return message;
	}


	public void setMessage(String message) {
		this.message = message;
	}
	
	

	public MessageService() {
		super();
	}


	@Override
	public void message() {
		System.out.println("your message status");
		System.out.println("message type "+msgType);
		System.out.println("message "+message);
	}

}
