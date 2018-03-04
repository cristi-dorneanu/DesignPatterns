package com.java.learn.design_patterns.structural.adaptor;

import java.util.ArrayList;
import java.util.List;

public class AdaptorClient {

	public List<Student> getStudents(){
		List<Student> students = new ArrayList<>();
		
		students.add(new UndergraduateStudent("ciuc", "national"));
		students.add(new GraduateStudentAdaptor(new GraduateStudents("ciuc", "info")));
		
		return students;
	}
}
