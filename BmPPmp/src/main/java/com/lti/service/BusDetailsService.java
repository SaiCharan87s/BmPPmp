package com.lti.service;

import java.util.List;

import com.lti.dao.BusDetailsNotFoundException;
import com.lti.model.BusDetails;

public interface BusDetailsService {
	List<BusDetails> selectAllBusDetails();

	BusDetails selectBusDetailsService(String bus_no);

//	List<BusDetails> selectBusDetailsByBusTypeService(String bus_type) throws BusDetailsNotFoundException;

//	List<BusDetails> selectBusDetailsByTravelsNameService(String travels_name) throws BusDetailsNotFoundException;

	int selectCostPerSeatService(String bus_no) throws BusDetailsNotFoundException;

	int selectNoOfSeatsService(String bus_no) throws BusDetailsNotFoundException;

	void addBusDetails(BusDetails bus);
}
