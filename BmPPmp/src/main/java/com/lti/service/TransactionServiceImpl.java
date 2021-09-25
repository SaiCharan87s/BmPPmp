package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.TransactionDao;
import com.lti.model.Transaction;

@Service
public class TransactionServiceImpl implements TransactionService{
	
	@Autowired
	TransactionDao transactionDao;

	@Override
	public int addTransaction(Transaction transaction) {
		return transactionDao.addTransaction(transaction);
	}

	@Override
	public List<Transaction> viewTransactionDetailsByTransactionID(int transaction_id) {
		return transactionDao.viewTransactionDetailsByTransactionID(transaction_id);
	}

	@Override
	public List<Transaction> viewCurrentTransactionByUserId(String registered_email) {
		return transactionDao.viewCurrentTransactionByUserId(registered_email);
	}

}
