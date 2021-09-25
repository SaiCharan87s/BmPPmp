package com.lti.dao;

import java.util.List;
import com.lti.model.BusSeatDetails;
import com.lti.model.BusSeatDetailsNotFoundException;

public interface BusSeatDetailsDao {
	
	List<BusSeatDetails> selectAllBusSeatesDetails();
	List<BusSeatDetails> selectBusSeatesDetailsByReservationId(int ReservationID)throws BusSeatDetailsNotFoundException;
	List<BusSeatDetails> selectBusSeatesDetailsBySeatNo(String SeatNo)throws BusSeatDetailsNotFoundException;
	List<BusSeatDetails> selectBusSeatesDetailsByJourneyID(int journeyID)throws BusSeatDetailsNotFoundException;
void updateBusSeatDetails(int rID,int jID,String s_no);
	
	void updateBusSeatesDetailsListSeat(int rID,int jID,List<String> seat_no);
	void updateSeatDetails(int rID) throws NumberException;

}
