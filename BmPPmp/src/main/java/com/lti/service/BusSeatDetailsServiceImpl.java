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


}
