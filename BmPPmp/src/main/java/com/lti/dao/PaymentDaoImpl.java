package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import com.lti.model.Payment;

public class PaymentDaoImpl implements PaymentDao {

	@PersistenceContext
	EntityManager em;
	@Override
	public int insertPayment(Payment ref) {
		em.persist(ref);
		int pid=ref.getPaymentId();//based on PK
		System.out.println("Payment inserted...");
		return pid;
	}

	@Override
	public List<Payment> viewPaymentDetailsByPaymentId(int paymentId) {
		// TODO Auto-generated method stub
		String jpql="select j from PaymentDetails j where j.paymentId=: vpaymentId";
		Query query=em.createQuery(jpql,Payment.class);
		query.setParameter("vpaymentId", paymentId);
		List<Payment> lu=query.getResultList();		
			return lu;
	}

	@Override
	public List<Payment> viewCurrentPaymentByUserId(String registeredEmail) {
		String jpql="select j from PaymentDetails j where j.registeredEmail=: vregistered_email";
		Query query=em.createQuery(jpql,Payment.class);
		query.setParameter("vregistered_email", registeredEmail);
		List<Payment> lu=query.getResultList();
		return lu;
	}

	@Override
	public void deletePayment(int rID) throws NumberException {
		Query query = em.createQuery("delete from PaymentDetails p where p.reservationId = :rID");
		query.setParameter("rID", rID);
		query.executeUpdate();

	}

}
