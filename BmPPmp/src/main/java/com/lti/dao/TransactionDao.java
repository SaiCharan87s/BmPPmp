package com.lti.dao;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.lti.model.Transaction;

@Repository
public interface TransactionDao {

	 public int addTransaction(Transaction transaction);
	 public List<Transaction> viewTransactionDetailsByTransactionID(int transaction_id);
	 public List<Transaction> viewCurrentTransactionByUserId(String registered_email);
	 void deleteTransaction(int reservation_id) throws NumberException;

}







	