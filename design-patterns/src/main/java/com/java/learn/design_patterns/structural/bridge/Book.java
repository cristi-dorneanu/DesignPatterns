package com.java.learn.design_patterns.structural.bridge;

public class Book {
	private String name;
	private String author;
	
	public Book() {
		this("", "");
	}
	
	public Book(String name, String author) {
		this.name = name;
		this.author = author;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getAuthor() {
		return author;
	}

	public void setAuthor(String author) {
		this.author = author;
	}
	
}
