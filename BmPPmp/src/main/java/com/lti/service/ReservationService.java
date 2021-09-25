package com.lti.service;

import java.util.List;

import org.springframework.stereotype.Service;
import com.lti.model.Reservation;

@Service
public interface ReservationService {
	
	public int addReservation(Reservation reservation);
	public List<Reservation> viewBookingDetailsByReservationId(int reservation_id);
	public List<Reservation> viewCurrentBookingByUserId(String registered_email);
	//public List<Reservation> viewAllBooking();
    
}
