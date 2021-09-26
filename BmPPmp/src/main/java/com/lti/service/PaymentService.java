package com.lti.service;

import com.lti.dao.NumberException;
import com.lti.model.Payment;
import java.util.List;

public interface PaymentService {
	public int insertPayment(Payment ref);
	public List<Payment> viewPaymentDetailsByPaymentId(int payment_id);
	public List<Payment> viewCurrentPaymentByUserId(String registered_email);
	public void deletePayment(int rID) throws NumberException;

}
