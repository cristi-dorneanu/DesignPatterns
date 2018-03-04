package com.java.learn.design_patterns.structural.adaptor;

public class UndergraduateStudent implements Student {

	private String name = "";
	private String school = "";
	
	public UndergraduateStudent(String name, String school) {
		this.name = name;
		this.school = school;
	}
	
	public String getName() {
		return name;
	}

	public String getSchool() {
		return school;
	}

	public void setName(String name) {
		this.name = name;
	}

	public void setSchool(String school) {
		this.school = school;
	}
	
	@Override
	public String toString() {
		return "NAME: " + this.getName() + " SCHOOL: " + this.getSchool();
	}
}
