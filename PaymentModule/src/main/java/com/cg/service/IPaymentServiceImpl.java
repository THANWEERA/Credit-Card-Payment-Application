package com.cg.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cg.entity.Payment;
import com.cg.exception.PaymentNotFoundException;
import com.cg.repository.IPaymentRepository;

@Service
public class IPaymentServiceImpl implements IPaymentService {

	@Autowired
	IPaymentRepository paymentrepository;

	Payment pmt;

	@Override
	public Payment addPayment(Payment payment) {
		paymentrepository.saveAndFlush(payment);
		return payment;
	}

	@Override
	public Payment removePayment(long id) {
		Payment payment=paymentrepository.findById(id).get();
		paymentrepository.deleteById(id);
		System.out.println("Payment removed successfully");
		return pmt;
	}

	@Override
	public Payment updatePayment(long id, Payment payment) {
		if (paymentrepository.existsById(payment.getPaymentId())) {
			Payment pmt = paymentrepository.findById(payment.getPaymentId()).get();
			pmt.setMethod(payment.getMethod());
			pmt.setAmountDue(payment.getAmountDue());

			paymentrepository.save(pmt);

			return pmt;
		} else {

			throw new PaymentNotFoundException("Payment not found");
		}
	}

	@Override
	public Payment getPayment(long id) {
		if(paymentrepository.existsById(id)) {
		return paymentrepository.findById(id).get();
	}
		else {
			throw new PaymentNotFoundException("Payment not found");
		}

}
}
