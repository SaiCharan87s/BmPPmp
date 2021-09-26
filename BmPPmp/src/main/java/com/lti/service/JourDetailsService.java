package com.lti.service;

import java.util.List;

import com.lti.dao.NumberException;
import com.lti.model.JourDetails;
import com.lti.model.JourDetailsException;

public interface JourDetailsService {
	List<JourDetails> selectAllJourDetails();
	JourDetails selectJourDetails(int journey_id) throws JourDetailsException;
	List<JourDetails> selectJourDetailsbySourceLocation(String sourceLoc) throws JourDetailsException;
	List<JourDetails> selectJourDetailsbyDestinationLocation(String destinationLoc) throws JourDetailsException;
	List<JourDetails> selectJourDetailsbyJourneyID(int journeyId) throws JourDetailsException;
	int selectAvailableSeates(String busNo, int journeyId) throws JourDetailsException;
	void changeAvailableSeats(int jID, int rID) throws NumberException;

	void decreaseSeatCount(int jID, int rID);
//  List<JourDetails> selectJourDetailsbyDepartureTime(String departure_Time) JourDetailsException;
//  List<JourDetails> selectJourDetailsbyArrivalTime(String arrival_Time) throws JourDetailsNotFoundException ;
//  List<JourDetails> selectJourDetailsbyDepartureDate(Date departure_date) throws JourDetailsException;
}
