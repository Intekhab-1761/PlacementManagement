package com.cg.placementservice;

import com.cg.placemententity.Placement;

public interface PlacementService {

	public abstract Placement addPLacement(Placement placement);
	
	public abstract Placement updateLacement(Placement placement);
	
	public abstract Placement searchPLacement(int id);
	
	public abstract boolean cancelPLacement(int id);
	
	
	
	
}
