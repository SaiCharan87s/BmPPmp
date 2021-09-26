package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.model.Payment;
import com.lti.service.PaymentService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/payment")
public class PaymentController {
	
	@Autowired
	PaymentService paymentService;
	
	@PostMapping
	@ResponseBody
	@RequestMapping(value="/addPayment")
		public int insertPayment(@RequestBody Payment rd) {
		System.out.println("addReserver()...method ");
		//BusDetails bus = new BusDetails(); // spring JPA - get the data from DB
	//emp.setEmployeeNumber(eno);
		Payment r=rd;
		int pid=paymentService.insertPayment(r);
			//empList.add(emp);
		return pid;
	
	}	
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/viewPaymentDetailsByPaymentId/{payment_id}")
	public List<Payment> viewPaymentDetailsByPaymentId(@PathVariable int payment_id)
	{
	return paymentService.viewPaymentDetailsByPaymentId(payment_id);
	}
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/viewCurrentPaymentByUserId/{registered_email}")
	public List<Payment> viewCurrentPaymentByUserId(@PathVariable String registered_email){
		return paymentService.viewCurrentPaymentByUserId(registered_email);
		
	}
	

}
