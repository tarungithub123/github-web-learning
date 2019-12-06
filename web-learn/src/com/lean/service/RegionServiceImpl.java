package com.lean.service;

import java.util.List;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lean.dao.RegionDAO;
import com.lean.entity.Region;

@Service
public class RegionServiceImpl implements RegionService {

	@Autowired 
	private RegionDAO regiondao; 
	
	@Transactional
	@Override
	public List<Region> getRegion() {
		// TODO Auto-generated method stub
		return regiondao.getRegion();
		 
	}

	@Override
	@Transactional
	public void saveRegion(Region theregion) {
		
		regiondao.saveRegion(theregion);
	}

}
