package com.lti.service;
import java.util.List;

import com.lti.model.BusSeatDetails;
import com.lti.model.BusSeatDetailsNotFoundException;

public interface BusSeatDetailsService {
	List<BusSeatDetails> selectAllBusSeatesDetailsService();
	List<BusSeatDetails> selectBusSeatesDetailsByReservationIdService(int ReservationID)throws BusSeatDetailsNotFoundException;
	List<BusSeatDetails> selectBusSeatesDetailsBySeatNoService(String SeatNo)throws BusSeatDetailsNotFoundException;
	List<BusSeatDetails> selectBusSeatesDetailsByJourneyIDService(int journeyID)throws BusSeatDetailsNotFoundException;
	void updateBusSeatesDetails(int rID,int jID,String s_no);
	public void updateBusSeatesDetailsListSeat(int rID,int jID, List<String> seat_no);
	 public void decreaseSeatCount(int jID, int rID);
}
