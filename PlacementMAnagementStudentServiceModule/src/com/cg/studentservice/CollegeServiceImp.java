package com.cg.studentservice;

import com.cg.studententities.College;
import com.cg.studentrepository.CollegeRepo;
import com.cg.studentrepository.CollegeRepoImp;

public class CollegeServiceImp implements CollegeService{

	private CollegeRepo dao;
	
	public CollegeServiceImp() {
		dao=new CollegeRepoImp();
	}
	
	@Override
	public College addCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College searchCollege(College college) {
		dao.beginTransaction();
		dao.addCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public College updateCollege(College college) {
		dao.beginTransaction();
		dao.updateCollege(college);
		dao.commitTransaction();
		return null;
	}

	@Override
	public boolean deleteCollege(int id) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public College schedulePlacement(College college) {
		// TODO Auto-generated method stub
		return null;
	}

}
