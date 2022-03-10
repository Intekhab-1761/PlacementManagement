package com.cg.studentservice;

import com.cg.studententities.College;

public interface CollegeService {
	
	public abstract College addCollege(College college);
	public abstract College searchCollege(College college);
	public abstract College updateCollege(College college);
    public abstract boolean deleteCollege(int id);
    public abstract College schedulePlacement(College college);
}
