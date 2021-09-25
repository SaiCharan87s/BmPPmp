package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.ReservationDao;
import com.lti.model.Reservation;

@Service
public class ReservationServiceImpl implements ReservationService{
	
	@Autowired
	ReservationDao reservationDao;

	@Override
	public int addReservation(Reservation reservation) {
		return reservationDao.addReservation(reservation);
	}

	@Override
	public List<Reservation> viewBookingDetailsByReservationId(int reservation_id) {
		return reservationDao.viewBookingDetailsByReservationId(reservation_id);
	}

	@Override
	public List<Reservation> viewCurrentBookingByUserId(String registered_email) {
		return reservationDao.viewCurrentBookingByUserId(registered_email);
	}

}
