package com.lean.dao;

import java.util.List;

import javax.transaction.Transactional;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.query.Query;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.lean.entity.Region;

@Repository
public class RegionDAOImpl implements RegionDAO {

	
	//inject hibernate session factory
	@Autowired 
	private SessionFactory sessionfactory; 
	
	
	
	public List<Region> getRegion() {
		
		//get the current hiberante session 
		Session currentsession = sessionfactory.getCurrentSession();
		
		//create query 
		Query<Region> thequery = currentsession.createQuery("from Region order by id ",Region.class);  
		
		//get the result from query
		List<Region> region = thequery.getResultList();
		
		//retrun the customers 
		
		return region;
	}

	@Override
	public void saveRegion(Region theregion) {
		
		//get the current hiberante session 
		Session currentsession = sessionfactory.getCurrentSession();
				
		//save the region
		currentsession.save(theregion);
		
		
	}

	
	
	
	
}
