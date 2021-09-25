package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.JourDetailsDao;
import com.lti.dao.NumberException;
import com.lti.model.JourDetails;
import com.lti.model.JourDetailsException;
@Service
public class JourDetailsSeviceImpl implements JourDetailsService {

	@Autowired
	JourDetailsDao jourDetailsDao;
	
	
	@Override
	public List<JourDetails> selectAllBusJourneyDetails() {
		// TODO Auto-generated method stub
		return jourDetailsDao.selectAllBusJourneyDetails();
	}

	@Override
	public JourDetails selectBusJourneyDetails(int journey_id) throws JourDetailsException {
		// TODO Auto-generated method stub
		return jourDetailsDao.selectBusJourneyDetails(journey_id);
	}

	@Override
	public List<JourDetails> selectBusJourneyDetailsbySourceLocation(String sourceLoc) throws JourDetailsException {
		// TODO Auto-generated method stub
		return jourDetailsDao.selectBusJourneyDetailsbySourceLocation(sourceLoc);
	}

	@Override
	public List<JourDetails> selectBusJourneyDetailsbyDestinationLocation(String destinationLoc)
			throws JourDetailsException {
		return jourDetailsDao.selectBusJourneyDetailsbyDestinationLocation(destinationLoc);
	}

	@Override
	public List<JourDetails> selectBusJourneyDetailsbyJourneyID(int journeyId) throws JourDetailsException {
		// TODO Auto-generated method stub
		return jourDetailsDao.selectBusJourneyDetailsbyJourneyID(journeyId);
	}

	@Override
	public int selectAvailableSeates(String busNo, int journeyId) throws JourDetailsException {
		// TODO Auto-generated method stub
		return jourDetailsDao.selectAvailableSeates(busNo, journeyId);
	}

	@Override
	public void changeAvailableSeats(int jID, int rID) throws NumberException {
		// TODO Auto-generated method stub
		System.out.println("changeAvailableSeats");
		try {
			jourDetailsDao.changeAvailableSeats(jID,rID);
		System.out.println("Seats Count Changed");
		}
		catch(NumberException e) {
		e.printStackTrace();
		}
		}


//	@Override
//	public void decreaseSeatCount(int jID, int rID) {
//		// TODO Auto-generated method stub
//
//	}

}
