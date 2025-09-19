package com.student.exception;

public class StudentCustomException extends RuntimeException {
	
	
	private static final long serialVersionUID = 1L;
	
	private String errorCode;

	public StudentCustomException(String errorCode, String message) {
		super(message);
		this.errorCode = errorCode;
	}
	
	
	public String getErrorCode() {
		return errorCode;
	}
	
	// why only setter not getter
	// Because exceptions are meant to be immutable (unchangeable) after they are created.

}
