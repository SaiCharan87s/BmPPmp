package com.lti.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.JourDetails;
import com.lti.model.JourDetailsException;

@Repository
public class JourDetailsDaoImpl implements JourDetailsDao {

	@PersistenceContext
	EntityManager entityManager;

	public JourDetailsDaoImpl() 

		{
			System.out.println("JourDetailsRepositoryImpl()..Created...");
		}

//		@Transactional
//		public List<JourDetails> selectAllJourDetails() {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//
//			Query query = entityManager.createQuery("from JourDetails");
//			List<JourDetails> JourDetailsList = query.getResultList();
//			System.out.println("busDetailsList " + JourDetailsList.size());
//
//			return JourDetailsList;
//		}
//
//		@Transactional
//		public JourDetails selectJourDetails(int journey_id) throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			System.out.println("inside selectbusjourney...");
//			EntityManager entityManager = getEntityManager();
//			return entityManager.find(JourDetails.class, journey_id);// based on PK
//
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbyDepartureTime(String departure_Time)
//				throws JourDetailsNotFoundException {
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.departure_Time = :vdeparture_Time");
//			query.setParameter("vdeparture_Time", departure_Time);
//			List<JourDetails> JourDetailsbyDepartureTime = query.getResultList();
//			return JourDetailsbyDepartureTime;
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbyArrivalTime(String arrival_Time)
//				throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.arrival_Time = :varrival_Time");
//			query.setParameter("varrival_Time", arrival_Time);
//			List<JourDetails> JourDetailsbyArrivalTime = query.getResultList();
//			return JourDetailsbyArrivalTime;
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbySourceLocation(String source_loc)
//				throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.source_loc = :vsource_loc");
//			query.setParameter("vsource_loc", source_loc);
//			List<JourDetails> JourDetailsbysource_loc = query.getResultList();
//			return JourDetailsbysource_loc;
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbyDestinationLocation(String destination_loc)
//				throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.destination_loc = :vdestination_loc");
//			query.setParameter("vdestination_loc", destination_loc);
//			List<JourDetails> JourDetailsbydestinationLoc = query.getResultList();
//			return JourDetailsbydestinationLoc;
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbyDepartureDate(Date departure_date)
//				throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.departure_date = :vdeparture_date");
//			query.setParameter("vdeparture_date", departure_date);
//			List<JourDetails> JourDetailsbydeparture_date = query.getResultList();
//			return JourDetailsbydeparture_date;
//		}
//
//		@Transactional
//		public List<JourDetails> selectJourDetailsbyJourneyID(int journeyID)
//				throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager
//					.createQuery("select j from JourDetails j where j.journeyID = :vjourneyID");
//			query.setParameter("vjourneyID", journeyID);
//			List<JourDetails> JourDetailsbyjourneyID = query.getResultList();
//			return JourDetailsbyjourneyID;
//		}
//
//		@Transactional
//		public int selectAvailableSeates(String busNo, int journeyId) throws JourDetailsNotFoundException {
//			// TODO Auto-generated method stub
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager.createQuery(
//					"select b from JourDetails b where b.bus_no = : vbus_no and b.journey_ID = : v_journeyID");
//			query.setParameter("vbus_no", busNo);
//			query.setParameter("v_journeyID", journeyId);
//			int seates = query.getFirstResult();
//			System.out.println("Seates availabel " + seates);
//			return seates;
//		}
//
//		// @Transactional
////		public boolean updatebusRoute(int journeyId, String source, String destination) {
////			// TODO Auto-generated method stub
////			boolean res=false;
////			EntityManager entityManager = getEntityManager();
////			JourDetails JourDetails=entityManager.find(JourDetails.class, journeyId );
////			if (JourDetails!=null)
////			{
////				JourDetails.setSource_loc(source);
////				JourDetails.setDestination_loc(destination);
////				entityManager.persist(JourDetails);	
////				res=true;
////			}
////			return res;
////		}
//		@Transactional
//		public void decreaseSeatCount(int jID, int rID) {
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager.createQuery(
//					"update JourDetails b set b.available_seates = ((select s.available_seates from JourDetails s where s.journeyID = :jID) - (select r.seats_Booked from ReservationDetails r where r.journey_Id = :jID and r.reservation_id = :rID)) where b.journeyID = :jID")
//					.setParameter("jID", jID).setParameter("rID", rID);
//			query.executeUpdate();
//		}
//
//		@Transactional
//		public void changeAvailableSeats(int jID, int rID) throws NumberNotFoundException {
//			EntityManager entityManager = getEntityManager();
//			Query query = entityManager.createQuery(
//					"update JourDetails b set b.available_seates = (select r.seats_Booked from ReservationDetails r where r.journey_Id = :jID and r.reservation_id = :rID) + b.available_seates where b.journeyID = :jID")
//					.setParameter("jID", jID).setParameter("rID", rID);
//			query.executeUpdate();
//		}

	@Override
	@Transactional
	public List<JourDetails> selectAllJourDetails() {
		// TODO Auto-generated method stub
		Query query = entityManager.createQuery("from JourDetails");
		List<JourDetails> JourDetailsList = query.getResultList();
		System.out.println("busDetailsList " + JourDetailsList.size());
		return JourDetailsList;
	}

	@Override
	@Transactional
	public JourDetails selectJourDetails(int journey_id) throws JourDetailsException {
		// TODO Auto-generated method stub
		System.out.println("inside selectbusjourney...");
		return entityManager.find(JourDetails.class, journey_id);
	}

	@Override
	@Transactional
	public List<JourDetails> selectJourDetailsbySourceLocation(String sourceLoc)
		throws JourDetailsException {

			Query query = entityManager.createQuery("select j from JourDetails j where j.source_loc = :vsource_loc");
			query.setParameter("vsource_loc", sourceLoc);
			List<JourDetails>  JourDetailsbysource_loc= query.getResultList();
			return JourDetailsbysource_loc;
	}

	@Override
	@Transactional
	public List<JourDetails> selectJourDetailsbyDestinationLocation(String destinationLoc)
			throws JourDetailsException {
		Query query = entityManager.createQuery("select j from JourDetails j where j.destination_loc = :vdestination_loc");
		query.setParameter("vdestination_loc", destinationLoc);
		List<JourDetails>  JourDetailsbydestinationLoc= query.getResultList();
		return JourDetailsbydestinationLoc;
	}
	
	
	@Override
	@Transactional
	public List<JourDetails> selectJourDetailsbyJourneyID(int journeyId) throws JourDetailsException {
		Query query = entityManager.createQuery("select j from JourDetails j where j.journeyID = :vjourneyID");
		query.setParameter("vjourneyID", journeyId);
		List<JourDetails>  JourDetailsbyjourneyID= query.getResultList();
		return  JourDetailsbyjourneyID;
	}

	@Override
	@Transactional
	public int selectAvailableSeates(String busNo, int journeyId) throws JourDetailsException {
		Query query = entityManager.createQuery("select b from JourDetails b where b.bus_no = : vbus_no and b.journey_ID = : v_journeyID");
		query.setParameter("vbus_no", busNo);
		query.setParameter("v_journeyID", journeyId);
		int seates=  query.getFirstResult();
		System.out.println("Seates availabel "+seates);
		return seates ;
	}

	@Override
	@Transactional
	public void changeAvailableSeats(int jID, int rID) throws NumberException {
		Query query = entityManager.createQuery("update JourDetails b set b.available_seates = ((select s.available_seates from JourDetails s where s.journeyID = :jID) - (select r.seats_Booked from ReservationDetails r where r.journey_Id = :jID and r.reservation_id = :rID)) where b.journeyID = :jID").setParameter("jID",jID).setParameter("rID", rID);
		query.executeUpdate();
		}
		

	@Override
	@Transactional
	public void decreaseSeatCount(int jID, int rID) {
		Query query = entityManager.createQuery("update JourDetails b set b.available_seates = (select r.seats_Booked from ReservationDetails r where r.journey_Id = :jID and r.reservation_id = :rID) + b.available_seates where b.journeyID = :jID").setParameter("jID",jID).setParameter("rID", rID);
		query.executeUpdate();
		
	}

}
