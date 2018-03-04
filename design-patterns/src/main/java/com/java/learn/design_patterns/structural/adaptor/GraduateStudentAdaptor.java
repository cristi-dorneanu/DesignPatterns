package com.java.learn.design_patterns.structural.adaptor;

public class GraduateStudentAdaptor implements Student {

	private GraduateStudents student;
	
	public GraduateStudentAdaptor(GraduateStudents student) {
		this.student = student;
	}
	
	@Override
	public String getName() {
		return this.student.getFullName();
	}

	@Override
	public String getSchool() {
		return this.student.getCollege();
	}

	@Override
	public String toString() {
		return "NAME: " + this.getName() + " SCHOOL: " + this.getSchool();
	}
}
