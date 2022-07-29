package com.cg.sprint.exception;

public class RemainderNotFoundException extends RuntimeException{


	private static final long serialVersionUID = 1L;

	public RemainderNotFoundException() {
		super();
	}

	public RemainderNotFoundException(String exceptionMessage) {
		super(exceptionMessage);
	}

}

