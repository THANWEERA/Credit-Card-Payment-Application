package com.cg.entity;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotBlank;

@Entity
public class Payment {

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private long paymentId;
	@NotBlank(message="Method cannot be blank")
	private String method;
	private double amountDue;
	public Payment() {
		super();
	}
	public Payment(long paymentId, String method, double amountDue) {
		super();
		this.paymentId = paymentId;
		this.method = method;
		this.amountDue = amountDue;
	}
	public long getPaymentId() {
		return paymentId;
	}
	public void setPaymentId(long paymentId) {
		this.paymentId = paymentId;
	}
	public String getMethod() {
		return method;
	}
	public void setMethod(String method) {
		this.method = method;
	}
	public double getAmountDue() {
		return amountDue;
	}
	public void setAmountDue(double amountDue) {
		this.amountDue = amountDue;
	}
	@Override
	public String toString() {
		return "Payment [paymentId=" + paymentId + ", method=" + method + ", amountDue=" + amountDue + "]";
	}
	
}
