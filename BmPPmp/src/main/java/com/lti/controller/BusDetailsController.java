package com.lti.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.lti.dao.BusDetailsNotFoundException;
import com.lti.model.BusDetails;
import com.lti.service.BusDetailsService;

public class BusDetailsController {
	
	@Autowired
	BusDetailsService busDetailsService;
	
	@GetMapping(value = "/getAllBusDetails")
//	@ResponseBody
//	@RequestMapping
	public List<BusDetails> getAllBusDetails() {
		System.out.println("getEmployees() ");
		return busDetailsService.selectAllBusDetails(); // FROM THE DB
	}
	
	@GetMapping(value = "/getBusDetails")
//	@ResponseBody
//	@RequestMapping
	 BusDetails getBusDetails(@RequestParam String bno)
	 {
		return busDetailsService.selectBusDetailsService(bno);
	 }
	
	@GetMapping(value = "/getCostPerSeat")
//	@ResponseBody
//	@RequestMapping(value = "/getCostPerSeat/{busno}")
	public int getCostPer_Seat(@RequestParam String busno)  {
		System.out.println("get allBusJourneyDetails() ");
		try {
			return busDetailsService.selectCostPerSeatService(busno) ;
		} 
		catch (BusDetailsNotFoundException e) {
			e.printStackTrace();
		}
		return 0;
	}
	
	@GetMapping(value = "/getTotalNoOfSeates")
//	@ResponseBody
//	@RequestMapping(value = "/getTotalNoOfSeates/{busno}")
	public int getTotalNoOfSeates(@RequestParam String busno) throws BusDetailsNotFoundException {
		System.out.println("get allBusJourneyDetails() ");
		return busDetailsService.selectNoOfSeatsService(busno) ;
		//return -1;
	}
	
	@PostMapping("/addBus")
	//public ResponseEntity addBus(@RequestBody BusDetails bus)
	public void addBus(@RequestBody BusDetails bus)
	{
		busDetailsService.addBusDetails(bus);
		//return new ResponseEntity(HttpStatus.OK);
	}
	
}
