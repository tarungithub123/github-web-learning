package com.lean.dao;

import java.util.List;

import com.lean.entity.Region;

public interface RegionDAO {

	public List<Region> getRegion();

	public void saveRegion(Region theregion);
}
