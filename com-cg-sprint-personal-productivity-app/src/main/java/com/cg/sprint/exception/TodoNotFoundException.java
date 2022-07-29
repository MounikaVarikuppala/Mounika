package com.cg.sprint.exception;


public class TodoNotFoundException extends RuntimeException {

	private static final long serialVersionUID = 106023461980066492L;

	public TodoNotFoundException() {
		super();
	}

	public TodoNotFoundException(String message) {
		super(message);
	}
}