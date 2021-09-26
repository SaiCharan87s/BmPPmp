package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BusSeatDetailsDao;
import com.lti.dao.NumberException;
import com.lti.model.BusSeatDetails;
import com.lti.model.BusSeatDetailsNotFoundException;

@Service
public class BusSeatDetailsServiceImpl implements BusSeatDetailsService {
	@Autowired
	BusSeatDetailsDao busSeatDetailsDao;
	
	
	@Override
	public List<BusSeatDetails> selectAllBusSeatesDetailsService() {
		// TODO Auto-generated method stub
		return busSeatDetailsDao.selectAllBusSeatesDetails();
	}

	@Override
	public List<BusSeatDetails> selectBusSeatesDetailsByReservationIdService(int ReservationID)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatDetailsDao.selectBusSeatesDetailsByReservationId(ReservationID);
	}

	@Override
	public List<BusSeatDetails> selectBusSeatesDetailsBySeatNoService(String SeatNo)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatDetailsDao.selectBusSeatesDetailsBySeatNo(SeatNo);
	}

	@Override
	public List<BusSeatDetails> selectBusSeatesDetailsByJourneyIDService(int journeyID)
			throws BusSeatDetailsNotFoundException {
		// TODO Auto-generated method stub
		return busSeatDetailsDao.selectBusSeatesDetailsByJourneyID(journeyID);
	}
	
	public void updateSeatDetails(int rID) throws NumberException{
		System.out.println("updateSeatDetails");
		try {
			busSeatDetailsDao.updateSeatDetails(rID);
			System.out.println("Seats Details Changed");
		}
		catch(NumberException e) {
			e.printStackTrace();
		}
	}

	@Override
	public void updateBusSeatesDetails(int rID, int jID, String s_no) {
		System.out.println("updateBusSeatesDetails() calling........");
		
		try {
			busSeatDetailsDao.updateBusSeatesDetails(rID,jID,s_no);
		System.out.println("ReservationId in BusSeatesDetails Updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void updateBusSeatesDetailsListSeat(int rID, int jID, List<String> seat_no) {
		System.out.println("updateBusSeatesDetailsListSeat() calling...");
		try {
			busSeatDetailsDao.updateBusSeatesDetailsListSeat(rID,jID,seat_no);
			System.out.println("ReservationId in BusSeatesDetails Updated");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
		
	}

	@Override
	public void decreaseSeatCount(int jID, int rID) {
		System.out.println("SeatCountDecrease");
		 
		busSeatDetailsDao.decreaseSeatCount(jID, rID);
	 System.out.println("Seats Count Decreased");
		
	}
	


}
