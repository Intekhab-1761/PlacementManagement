package com.cg.placementclient;

import java.time.LocalDate;

import com.cg.placemententity.Placement;
import com.cg.placementservice.PlacementService;
import com.cg.placementservice.PlacementServiceImp;

public class Client {

	public static void main(String[] args) {


		PlacementService service=new PlacementServiceImp();
		Placement placement=new Placement();
		
		placement.setId(1);
		placement.setName("Intekhab");
		placement.setCollege("HKBK");
		placement.setQualification("B.E");
		placement.setDate(LocalDate.now());
		placement.setYear(2022);
		service.addPLacement(placement);
		System.out.println("Placement added successfully");

	}

}
