package com.cg.studentservice;

import com.cg.studententities.Student;
import com.cg.studentrepository.StudentRepo;
import com.cg.studentrepository.StudentRepoImpl;

public class StudentServiceImpl implements StudentService{

	private StudentRepo repo;
	
	
	public StudentServiceImpl() {
		repo=new StudentRepoImpl();
	}

	@Override
	public void addStudent(Student student) {
		repo.beginTransaction();
		repo.addStudent(student);
		repo.commitTransaction();
	}

	@Override
	public void updateStudent(Student student) {
		repo.beginTransaction();
		repo.updateStudent(student);
		repo.commitTransaction();
		
	}

	@Override
	public void deleteStudent(int id) {
		repo.beginTransaction();
		repo.deleteStudent(id);
		repo.commitTransaction();
		
	}

	@Override
	public Student searchStudentbyId(int id) {
		repo.beginTransaction();
		repo.searchStudentById(id);
		repo.commitTransaction();
		return null;
	}

	@Override
	public Student searchStudentByHallTicket(int ticketno) {
		repo.beginTransaction();
		repo.searchStudentByhallTicket(ticketno);
		repo.commitTransaction();
		return null;
	}

	@Override
	public void addCertificate(Student student) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void updateCertificate(Student student) {
		// TODO Auto-generated method stub
		
	}

	

}
