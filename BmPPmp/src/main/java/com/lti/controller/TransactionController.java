package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Transaction;
import com.lti.service.TransactionService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/transaction")
public class TransactionController {

	@Autowired
	TransactionService ts;

	@PostMapping(path = "/addTransaction")
	public int addTransaction(@RequestBody Transaction trans) {
		System.out.println("Transaction added successfully");
		Transaction t = trans;
		Integer tid = ts.addTransaction(t);
		return tid;
	}

	@GetMapping("/viewTransactionDetailsByBookingId")
	public List<Transaction> viewTransactionDetailsByTransactionID(@RequestParam("id") int transaction_id) {
		return ts.viewTransactionDetailsByTransactionID(transaction_id);
	}

	@GetMapping("/viewCurrentTransactionByUserId")
	public List<Transaction> viewCurrentTransactionByUserId(@RequestParam("email") String registered_email) {
		return ts.viewCurrentTransactionByUserId(registered_email);

	}


}
