package com.cg.studentrepository;

import com.cg.studententities.Student;

public interface StudentRepo {
	public abstract Student searchStudentById(int id);

	public abstract Student searchStudentByhallTicket(int ticketno);

	public abstract void addStudent(Student student);

	public abstract boolean deleteStudent(int id);

	public abstract void updateStudent(Student student);

	public abstract void commitTransaction();

	public abstract void beginTransaction();
}
