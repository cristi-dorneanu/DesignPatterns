package com.java.learn.design_patterns.structural.adaptor;

public class App {
	public static void main(String[] args) {
		AdaptorClient client = new AdaptorClient();
		
		for(Student student : client.getStudents()) {
			System.out.println(student);
		}
	}
}
