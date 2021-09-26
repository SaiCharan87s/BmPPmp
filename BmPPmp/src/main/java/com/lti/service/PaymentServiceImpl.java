package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.NumberException;
import com.lti.dao.PaymentDao;
import com.lti.model.Payment;
@Service
public class PaymentServiceImpl implements PaymentService {

	@Autowired
	PaymentDao paymentDao;
	@Override
	public int insertPayment(Payment ref) {
		int pid =paymentDao.insertPayment(ref);
		return pid;
	}

	@Override
	public List<Payment> viewPaymentDetailsByPaymentId(int payment_id) {
		return paymentDao.viewPaymentDetailsByPaymentId(payment_id);
	}

	@Override
	public List<Payment> viewCurrentPaymentByUserId(String registered_email) {
		return paymentDao.viewCurrentPaymentByUserId(registered_email);
	}

	@Override
	public void deletePayment(int rID) throws NumberException {
		System.out.println("deletePayment...method "); 
		  try {
			  paymentDao.deletePayment(rID); System.out.println("Payment Deleted");
		 } 
		  catch (NumberException e) { e.printStackTrace(); } 

	}

}
