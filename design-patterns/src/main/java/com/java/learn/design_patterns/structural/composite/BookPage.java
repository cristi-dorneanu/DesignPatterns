package com.java.learn.design_patterns.structural.composite;

public class BookPage extends BookComponent{

	public BookPage(String name, String url) {
		this.url = url;
		this.name = name;
	}
	
	@Override
	public String toString() {
		return print(this);
	}

}
