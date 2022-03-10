package com.cg.studentclient;

import com.cg.studententities.Certificate;
import com.cg.studententities.Student;
import com.cg.studentservice.CertificateService;
import com.cg.studentservice.CertificateServiceImp;
import com.cg.studentservice.StudentService;
import com.cg.studentservice.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		CertificateService cservice=new CertificateServiceImp();
		
		Student student = new Student();
				
		student.setName("Intekhab");
		student.setCollege("HKBK");
		student.setRoll(42);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2022);
		student.setHallTicketNo(101);
		
		Certificate certificate= new Certificate();
		
		certificate.setCollege("HKBK");
		certificate.setYear(2022);
		
		
		//certificate.setStudent(student);
		student.setCertificate(certificate);
		
		//cservice.addCertificate(certificate);
		service.addStudent(student);

		
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
