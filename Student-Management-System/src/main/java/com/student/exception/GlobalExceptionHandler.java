package com.student.exception;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.bind.annotation.RestControllerAdvice;

import com.student.dto.ErrorResponse;

@RestControllerAdvice
public class GlobalExceptionHandler {
	
	@ExceptionHandler(StudentCustomException.class)
	
	public ResponseEntity<ErrorResponse> handleStudentException(StudentCustomException ex) {
	    ErrorResponse response = new ErrorResponse(ex.getErrorCode(), ex.getMessage());
	    return ResponseEntity.status(HttpStatus.NOT_FOUND).body(response);
	}

}
