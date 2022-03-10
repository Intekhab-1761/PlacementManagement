package com.cg.studentservice;

import com.cg.studententities.Placement;
import com.cg.studentrepository.PlacementRepo;
import com.cg.studentrepository.PlacementRepoImp;

public class PlacementServiceImp implements PlacementService {
	
	private PlacementRepo dao;
	
	public PlacementServiceImp() {
		
		dao = new PlacementRepoImp();
	}

	@Override
	public Placement addPLacement(Placement placement) {
		dao.beginTransaction();
		dao.addPlacement(placement);
		dao.commitTransaction();
		return null;
	}

	@Override
	public Placement updateLacement(Placement placement) {
		dao.beginTransaction();
		dao.updatePlacement(placement);
		dao.commitTransaction();
		return placement;
	}

	@Override
	public Placement searchPLacement(int id) {
		dao.beginTransaction();
		dao.searchPlacement(id);
		dao.commitTransaction();
		return null;
	}

	@Override
	public boolean cancelPLacement(int id) {
		// TODO Auto-generated method stub
		return false;
	}

}
