package com.cg.studentservice;

import com.cg.studententities.Placement;

public interface PlacementService {

	public abstract Placement addPLacement(Placement placement);
	
	public abstract Placement updateLacement(Placement placement);
	
	public abstract Placement searchPLacement(int id);
	
	public abstract boolean cancelPLacement(int id);
	
	
	
	
}
