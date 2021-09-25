package com.lti.dao;

import org.springframework.stereotype.Repository;

import com.lti.model.Reservation;
import java.util.List;

@Repository
public interface ReservationDao {
	
	 public int addReservation(Reservation reservation);
	 public List<Reservation> viewBookingDetailsByReservationId(int reservation_id);
	 public List<Reservation> viewCurrentBookingByUserId(String registered_email);
	 //public List<Reservation> viewAllBooking();
     void deleteReservation(int reservation_id) throws NumberException;

}











 
	
 



	
	
	
	
	
	
	
