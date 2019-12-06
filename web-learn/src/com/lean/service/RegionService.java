package com.lean.service;

import java.util.List;

import com.lean.entity.Region;

public interface RegionService {
	
	public List<Region> getRegion();

	public void saveRegion(Region theregion);

}
