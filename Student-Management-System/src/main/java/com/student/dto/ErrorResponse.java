package com.student.dto;

public class ErrorResponse {

	
	 private String errorCode;
	    private String message;
	    
	    // constructor
	    public ErrorResponse(String errorCode, String message) {
	        this.errorCode = errorCode;
	        this.message = message;
	    
	    }

	    // getter and setter
	    
		public String getErrorCode() {
			return errorCode;
		}

		public void setErrorCode(String errorCode) {
			this.errorCode = errorCode;
		}

		public String getMessage() {
			return message;
		}

		public void setMessage(String message) {
			this.message = message;
		}
}
