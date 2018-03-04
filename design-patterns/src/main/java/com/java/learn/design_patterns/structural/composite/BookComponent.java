package com.java.learn.design_patterns.structural.composite;

import java.util.ArrayList;
import java.util.List;

public abstract class BookComponent {

	protected String name;
	protected String url;
	
	public BookComponent() {
		this.name = "";
		this.url = "";
	}
	
	private List<BookComponent> childs = new ArrayList<>();

	public String getName() {
		return name;
	}

	public String getUrl() {
		return url;
	}

	public List<BookComponent> getChilds() {
		return childs;
	}
	
	public BookComponent add(BookComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public BookComponent remove(BookComponent component) {
		throw new UnsupportedOperationException();
	}
	
	public abstract String toString();
	
	protected String print(BookComponent component) {
		StringBuilder sb = new StringBuilder();
		
		sb.append(name).append(" : ");
		sb.append(url).append("\n");
		
		return sb.toString();
	}
}
