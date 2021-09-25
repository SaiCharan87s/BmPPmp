package com.lti.dao;
import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.Query;

import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import com.lti.model.Reservation;

@Repository
public class ReservationDaoImpl implements ReservationDao{
	
	@PersistenceContext
	EntityManager em;

	@Override
	@Transactional
	public int addReservation(Reservation reservation) {
		em.persist(reservation); 
		int new_rid=reservation.getReservation_id();
	    System.out.println("New reservation added...");
		return new_rid;
	}

	@Override
	@Transactional
	public List<Reservation> viewBookingDetailsByReservationId(int reservation_id) {
		String jpql="select r from Reservation r where r.reservation_id=:rid";
		Query query=em.createQuery(jpql, Reservation.class);
		query.setParameter("rid", reservation_id);
		List<Reservation> bd=query.getResultList();
		return bd;
	}

	@Override
	@Transactional
	public List<Reservation> viewCurrentBookingByUserId(String registered_email) {
		String jpql="select r from Reservation r where r.registered_email=:email";
		Query query=em.createQuery(registered_email, Reservation.class);
		query.setParameter("email", registered_email);
		List<Reservation> bd=query.getResultList();
		return bd;
		
	}

	@Override
	@Transactional
	public void deleteReservation(int reservation_id) throws NumberException {
		Query query = em.createQuery("delete from Reservation r where r.reservation_id = :rid");
		query.setParameter("rid", reservation_id);
		query.executeUpdate();
	}

}











	
	