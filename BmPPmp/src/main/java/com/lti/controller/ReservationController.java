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

import com.lti.model.Reservation;
import com.lti.service.ReservationService;

@CrossOrigin(origins = "*")
@RestController
@RequestMapping("/reservation")
public class ReservationController {

	@Autowired
	ReservationService rs;

	@GetMapping("/viewBookingDetailsByReservationId")
	public List<Reservation> viewBookingDetailsByReservationId(@RequestParam int reservation_id) {
		return rs.viewBookingDetailsByReservationId(reservation_id);
	}

	@GetMapping("/viewCurrentBookingByUserId")
	public List<Reservation> viewCurrentBookingByUserId(@RequestParam String registered_email) {
		return rs.viewCurrentBookingByUserId(registered_email);

	}

	@PostMapping("/addReservation")
	public int addReservation(@RequestBody Reservation reserve) {
		System.out.println(reserve.toString());
		System.out.println("Reservation added successfully");
    	Reservation r = reserve;
		Integer rid = rs.addReservation(r);
		return rid;

	}

}
