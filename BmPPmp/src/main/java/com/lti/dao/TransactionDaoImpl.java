package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Transaction;

public class TransactionDaoImpl implements TransactionDao{
	
	@PersistenceContext
	EntityManager em;


	@Override
	@Transactional
	public int addTransaction(Transaction transaction) {
		em.persist(transaction); 
		int tid =transaction.getTransaction_id();
	    System.out.println("New transaction added...");
	    return tid;	
	}

	@Override
	@Transactional
	public List<Transaction> viewTransactionDetailsByTransactionID(int transaction_id) {
		String jpql="select t from Transaction t where t.transaction_id=:tid";
		Query query=em.createQuery(jpql, Transaction.class);
		query.setParameter("tid", transaction_id);
		List<Transaction> td=query.getResultList();
		return td;
		
	}

	@Override
	@Transactional
	public List<Transaction> viewCurrentTransactionByUserId(String registered_email) {
		String jpql="select t from Transaction t where t.registered_email=:email";
		Query query=em.createQuery(registered_email, Transaction.class);
		query.setParameter("email", registered_email);
		List<Transaction> td=query.getResultList();
		return td;
		
	}

	@Override
	@Transactional
	public void deleteTransaction(int reservation_id) throws NumberException {
		Query query = em.createQuery("delete from Transaction t where t.reservation_id = :rid");
		query.setParameter("rid", reservation_id);
		query.executeUpdate();
	}

}


