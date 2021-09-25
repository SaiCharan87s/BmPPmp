package com.lti.service;

import java.util.List;

import com.lti.dao.NumberException;
import com.lti.model.JourDetails;
import com.lti.model.JourDetailsException;

public interface JourDetailsService {
	List<JourDetails> selectAllBusJourneyDetails();

	JourDetails selectBusJourneyDetails(int journey_id) throws JourDetailsException;

//      List<JourDetails> selectBusJourneyDetailsbyDepartureTime(String departure_Time) JourDetailsException;
//      List<JourDetails> selectBusJourneyDetailsbyArrivalTime(String arrival_Time) throws BusJourneyDetailsNotFoundException ;
	List<JourDetails> selectBusJourneyDetailsbySourceLocation(String sourceLoc) throws JourDetailsException;

	List<JourDetails> selectBusJourneyDetailsbyDestinationLocation(String destinationLoc) throws JourDetailsException;

//      List<JourDetails> selectBusJourneyDetailsbyDepartureDate(Date departure_date) throws JourDetailsException;
	List<JourDetails> selectBusJourneyDetailsbyJourneyID(int journeyId) throws JourDetailsException;

	int selectAvailableSeates(String busNo, int journeyId) throws JourDetailsException;

	void changeAvailableSeats(int jID, int rID) throws NumberException;

//	void decreaseSeatCount(int jID, int rID);
}
