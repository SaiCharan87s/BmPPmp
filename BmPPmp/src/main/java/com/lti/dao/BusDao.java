package com.lti.dao;
import org.springframework.stereotype.Repository;



@Repository
public interface BusDao {
	boolean updatebusRoute(int journeyId,String source,String destination);
}
