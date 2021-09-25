package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.BusSeatDetails;
import com.lti.model.BusSeatDetailsNotFoundException;
@Repository
public class BusSeatDetailsDaoImpl implements BusSeatDetailsDao {

	@PersistenceContext
	EntityManager em;
	public BusSeatDetailsDaoImpl() {
		System.out.println("BusSeatesDetailsRepositoryImpl()......");
	}
	@Override
	@Transactional
	public List<BusSeatDetails> selectAllBusSeatesDetails() {
		Query query = em.createQuery(" from BusSeatesDetails");
		List<BusSeatDetails> busSeatesDetailsList = query.getResultList();
		System.out.println("BusSeatesDetails length "+busSeatesDetailsList.size());
		
		return busSeatesDetailsList;
	}

	@Override
	@Transactional
	public List<BusSeatDetails> selectBusSeatesDetailsByReservationId(int ReservationID)
			throws BusSeatDetailsNotFoundException {
		Query query = em.createQuery("select b from BusSeatesDetails b where b.reservation_id = :vreservation_id");
		query.setParameter("vreservation_id",ReservationID);
		List<BusSeatDetails> busSeatesDetailsbyReservationId= query.getResultList();
		return busSeatesDetailsbyReservationId;
	}

	@Override
	@Transactional
	public List<BusSeatDetails> selectBusSeatesDetailsBySeatNo(String SeatNo) throws BusSeatDetailsNotFoundException {
		Query query = em.createQuery("select b from BusSeatesDetails b where b.seat_no = :vseat_no");
		query.setParameter("vseat_no",SeatNo);
		List<BusSeatDetails> busSeatesDetailsbySeatNo= query.getResultList();
		return busSeatesDetailsbySeatNo;
	}

	@Override
	@Transactional
	public List<BusSeatDetails> selectBusSeatesDetailsByJourneyID(int journeyID)
			throws BusSeatDetailsNotFoundException {
		Query query = em.createQuery("select b from BusSeatesDetails b where b.journey_id = :vjourney_id");
		query.setParameter("vjourney_id",journeyID);
		List<BusSeatDetails> busSeatesDetailsbyjourneyID= query.getResultList();
		return busSeatesDetailsbyjourneyID;
	}

	@Override
	@Transactional
	public void updateBusSeatDetails(int rID, int jID, String s_no) {
		Query query=em.createQuery("update BusSeatesDetails set reservation_id=:rID where journey_id=:jID and seat_no=:s_no").setParameter("jID",jID).setParameter("rID", rID).setParameter("s_no",s_no);
		//query.setParameter("rID", rID);
		query.executeUpdate();

	}

	@Override
	@Transactional
	public void updateBusSeatesDetailsListSeat(int rID, int jID, List<String> seat_no)
	{
//		String seat_no1;
		for(String seat_no1: seat_no) {
			System.out.println(seat_no1);
		Query query=em.createQuery("update BusSeatesDetails set reservation_id=:rID where journey_id=:jID and seat_no=:s_no").setParameter("jID",jID).setParameter("rID", rID).setParameter("s_no",seat_no1);
		
		query.executeUpdate();

	}
	}

	@Override
	@Transactional
	public void updateSeatDetails(int rID) throws NumberException {
		Query query = em.createQuery("update BusSeatesDetails b set b.reservation_id=0 where b.reservation_id = :rID ").setParameter("rID", rID);
    	query.setParameter("rID", rID);
    			
    	query.executeUpdate();

	}

}
