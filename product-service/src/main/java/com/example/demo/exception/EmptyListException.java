package com.example.demo.exception;

public class EmptyListException extends RuntimeException {
	
	private String message;

	public EmptyListException(String message) {
		this.message = message;
	}

	public String getMessage() {
		return message;
	}
	
	
	

}
