package com.lti.controller;
import com.lti.model.BusSeatDetails;
import com.lti.model.MyDto;
import com.lti.service.BusSeatDetailsService;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.lti.dao.BusSeatDetailsDao;



@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/busSeatDetails")
public class BusSeatDetailsController {
	
	@Autowired
	BusSeatDetailsService busSeatDetailsService;
	
	@GetMapping
	@ResponseBody
	@RequestMapping(value="/updateBusSeatesDetails/{rID}/{jID}/{s_no}")
		public void updateBusSeatesDetails(@PathVariable int rID,@PathVariable int jID,@PathVariable String s_no) {
	System.out.println("Seates Details updating..");
	busSeatDetailsService.updateBusSeatesDetails(rID,jID,s_no);
	}
	
	@ResponseBody
	@RequestMapping(value="/updateBusSeatesDetailsListSeat/{rID}/{jID}/{seat_no}")
	public void updateBusSeatesDetailsListSeat(@PathVariable int rID,@PathVariable int jID,@PathVariable List<String>seat_no) {
		System.out.println("Lis of Seates Details updating.. ");
		busSeatDetailsService.updateBusSeatesDetailsListSeat(rID,jID,seat_no);
	}
	
	@ResponseBody
	@RequestMapping(value="/seatCountDecrease/")
	public void decreaseSeatCount(@RequestBody MyDto myDto)  {
		
		
		busSeatDetailsService.decreaseSeatCount(myDto.getJid(),myDto.getRid());
	}

}
