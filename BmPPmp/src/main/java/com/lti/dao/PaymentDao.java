package com.lti.dao;
import java.util.List;

import com.lti.model.Payment;
public interface PaymentDao {

	int insertPayment(Payment ref);
	
	public List<Payment> viewPaymentDetailsByPaymentId(int paymentId);

	
	public List<Payment> viewCurrentPaymentByUserId(String registeredEmail);
	void deletePayment(int rID) throws NumberException;
}
