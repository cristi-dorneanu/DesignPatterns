package com.java.learn.design_patterns.structural.adaptor;

public class GraduateStudents {
	private String fullName = "";
	private String college = "";
	
	public GraduateStudents(String fullName, String college) {
		this.fullName = fullName;
		this.college = college;
	}

	public String getFullName() {
		return fullName;
	}

	public void setFullName(String fullName) {
		this.fullName = fullName;
	}

	public String getCollege() {
		return college;
	}

	public void setCollege(String college) {
		this.college = college;
	}
	
}
