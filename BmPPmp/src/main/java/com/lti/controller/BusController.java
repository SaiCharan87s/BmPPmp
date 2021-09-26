package com.lti.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.lti.service.BusService;

@CrossOrigin(origins="*")
@RestController
@RequestMapping("/bus")
public class BusController {
	
	
	@Autowired
	BusService busService;
	
	@GetMapping("/changeRoute")
	public boolean updateBusRoute(@RequestParam int journeyId,@RequestParam String source,@RequestParam String destination)
	{
		return busService.updatebusRoute(journeyId, source, destination);
	}
	

	 
	
	
	
	

}
