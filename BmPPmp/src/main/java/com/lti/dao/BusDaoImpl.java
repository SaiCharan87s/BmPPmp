package com.lti.dao;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

import com.lti.model.JourDetails;

public class BusDaoImpl implements BusDao {

	@PersistenceContext
	EntityManager em;
	
	@Override
	@Transactional
	public boolean updatebusRoute(int journeyId, String source, String destination) {
		boolean res=false;
		JourDetails journeyDetails=em.find(JourDetails.class, journeyId );
		if (journeyDetails!=null)
		{
			journeyDetails.setSource_loc(source);
			journeyDetails.setDestination_loc(destination);
			em.persist(journeyDetails);	
			res=true;
		}
		return res;
		
	}

}
