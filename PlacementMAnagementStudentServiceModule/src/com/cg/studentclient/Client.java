package com.cg.studentclient;

import java.util.List;

import com.cg.studententities.Student;
import com.cg.studentservice.StudentService;
import com.cg.studentservice.StudentServiceImpl;

public class Client {

	public static void main(String[] args) {

		StudentService service = new StudentServiceImpl();
		Student student = new Student();

		student.setId(105);
		student.setName("Intekhab");
		student.setCollege("HKBK");
		student.setRoll(42);
		student.setQualification("B.E");
		student.setCourse("Engineering");
		student.setYear(2022);
		student.setCertificate("certificate");
		student.setHallTicketNo(101);
		service.addStudent(student);

		//student = service.searchStudentByHallTicket(101);
		System.out.print("ID:" + student.getId());
		System.out.println(" Name:" + student.getName());
		System.out.println("College:" + student.getCollege());
		System.out.println("Roll:" + student.getRoll());
		System.out.println("Qualification:" + student.getQualification());
		System.out.println("Course:" + student.getCourse());
		System.out.println("Year:" + student.getYear());
		System.out.println("Certificate:" + student.getCertificate());
		System.out.println("HallTicketNo:" + student.getHallTicketNo());

		//List<Student> list = (List<Student>) service.searchStudentByHallTicket(101);
		// student.setName("Md Intekhab Alam");

		System.out.println("End of program/Life cycle completed...");
	}
}
