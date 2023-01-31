package com.cg.controller;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;

import com.cg.exception.PaymentNotFoundException;

@ControllerAdvice
public class PaymentNotFoundExceptionController {
	@ExceptionHandler(value=PaymentNotFoundException.class)
	public ResponseEntity<Object> exceptionHandler(Exception ex) {
		return new ResponseEntity<>(ex.getMessage(),HttpStatus.NOT_FOUND);
	}
	
}
