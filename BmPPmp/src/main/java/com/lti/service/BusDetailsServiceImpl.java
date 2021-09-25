package com.lti.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lti.dao.BusDetailsDao;
import com.lti.dao.BusDetailsNotFoundException;
import com.lti.model.BusDetails;

@Service
public class BusDetailsServiceImpl implements BusDetailsService {

	@Autowired
	BusDetailsDao busDetailsDao;
	@Override
	public List<BusDetails> selectAllBusDetails() {
		return busDetailsDao.selectAllBusDetails();
	}

	@Override
	public BusDetails selectBusDetailsService(String bus_no) {
		return busDetailsDao.selectBusDetails(bus_no);
	}

//	@Override
//	public List<BusDetails> selectBusDetailsByBusTypeService(String bus_type) throws BusDetailsNotFoundException {
//		// TODO Auto-generated method stub
//		return busDetailRepositoryImpl.selectBusDetailsByBusType(bus_type);
//	}
//
//	@Override
//	public List<BusDetails> selectBusDetailsByTravelsNameService(String travels_name)
//			throws BusDetailsNotFoundException {
//		// TODO Auto-generated method stub
//		
//		return busDetailRepositoryImpl.selectBusDetailsByTravelsName(travels_name);
//	}

	@Override
	public int selectCostPerSeatService(String bus_no) throws BusDetailsNotFoundException {
		return busDetailsDao.selectCostPerSeat(bus_no);
	}

	@Override
	public int selectNoOfSeatsService(String bus_no) throws BusDetailsNotFoundException {
		return busDetailsDao.selectNoOfSeates(bus_no);
	}
	@Override
	public void addBusDetails(BusDetails bus) {
		busDetailsDao.addBusDetails(bus);
		
	}
}
