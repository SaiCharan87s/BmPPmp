package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.lti.model.Transaction;

@Service
public interface TransactionService {
	
	 public int addTransaction(Transaction transaction);
	 public List<Transaction> viewTransactionDetailsByTransactionID(int transaction_id);
	 public List<Transaction> viewCurrentTransactionByUserId(String registered_email);

}
