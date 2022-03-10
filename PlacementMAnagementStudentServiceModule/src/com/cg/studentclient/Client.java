package com.cg.studentclient;

import java.time.LocalDate;

import com.cg.studententities.Certificate;
import com.cg.studententities.College;
import com.cg.studententities.Placement;
import com.cg.studententities.Student;
import com.cg.studentservice.PlacementService;
import com.cg.studentservice.PlacementServiceImp;
import com.cg.studentservice.StudentService;
import com.cg.studentservice.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		PlacementService pservice=new PlacementServiceImp();
		
		Student student = new Student();
				
		student.setName("Intekhab");
		
		student.setRoll(42);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2022);
		student.setHallTicketNo(101);
		
		Certificate certificate= new Certificate();
		
		certificate.setCollege("HKBK");
		certificate.setYear(2022);
		
		College college = new College();
		
		college.setCollegeAdmin("James");
		college.setCollegeName("HKBK");
		college.setLocation("Bangalore");
		
		Placement placement=new Placement();
		
		placement.setName("dsfjsdo");
		placement.setDate(LocalDate.now());
		placement.setQualification("MSC");
		placement.setYear(2022);
		
		student.setCollege(college);
		placement.setCollege(college);
		
		//certificate.setStudent(student);
		student.setCertificate(certificate);
		
		//cservice.addCertificate(certificate);
		service.addStudent(student);
		pservice.addPLacement(placement);

		
		/*
		 * System.out.print("ID:" + student.getId()); System.out.println(" Name:" +
		 * student.getName()); System.out.println("College:" + student.getCollege());
		 * System.out.println("Roll:" + student.getRoll());
		 * System.out.println("Qualification:" + student.getQualification());
		 * System.out.println("Course:" + student.getCourse());
		 * System.out.println("Year:" + student.getYear());
		 * System.out.println("Certificate:" + student.getCertificate());
		 * System.out.println("HallTicketNo:" + student.getHallTicketNo());
		 */

		System.out.println("End of program/Life cycle completed...");
	}
}
