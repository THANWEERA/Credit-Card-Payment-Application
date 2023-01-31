package com.cg.exception;

public class PaymentNotFoundException extends RuntimeException{

	public PaymentNotFoundException(String str) {
		super(str);
	}

}
