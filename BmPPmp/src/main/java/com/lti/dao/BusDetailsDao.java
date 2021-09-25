package com.lti.dao;

import java.util.List;
import com.lti.model.BusDetails;

public interface BusDetailsDao {

		List<BusDetails> selectAllBusDetails();

		BusDetails selectBusDetails(String bus_no);

//		List<BusDetails> selectBusDetailsByBusType(String bus_type) throws BusDetailsNotFoundException;

//		List<BusDetails> selectBusDetailsByTravelsName(String travels_name) throws BusDetailsNotFoundException;

		int selectCostPerSeat(String bus_no) throws BusDetailsNotFoundException;

		int selectNoOfSeates(String bus_no) throws BusDetailsNotFoundException;

		void addBusDetails(BusDetails bus);
}
