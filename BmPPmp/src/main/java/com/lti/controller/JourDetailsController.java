package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.JourDetailsService;

@CrossOrigin(origins = "*")
@RestController // it is a specialized version of @Component - marker to receive web request
@RequestMapping("/busJourneyDetails")
public class JourDetailsController {
	@Autowired
	JourDetailsService jourDetailsService;
	
public	JourDetailsController(){
		System.out.println("JourneyDetailsJPAController() .....");
	}


}
