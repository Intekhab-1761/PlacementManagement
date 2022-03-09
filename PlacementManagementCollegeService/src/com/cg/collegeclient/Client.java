package com.cg.collegeclient;

import com.cg.collegeentity.College;
import com.cg.collegeservice.CollegeService;
import com.cg.collegeservice.CollegeServiceImp;

public class Client {

	public static void main(String[] args) {
		
		CollegeService service= new CollegeServiceImp();
		
		College college=new College();
		
		college.setId(1);
		college.setCollegeName("HKBK");
		college.setCollegeAdmin("FirstAdmin");
		college.setLocation("Bangalore");
		service.addCollege(college);
		System.out.println("College details added ");
	}

}
