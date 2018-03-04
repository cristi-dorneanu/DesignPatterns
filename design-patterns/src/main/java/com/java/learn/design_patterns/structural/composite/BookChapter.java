package com.java.learn.design_patterns.structural.composite;

import java.util.Iterator;

public class BookChapter extends BookComponent{

	public BookChapter(String name, String url) {
		this.name = name;
		this.url = url;
	}
	
	@Override
	public BookComponent add(BookComponent component) {
		this.getChilds().add(component);
		return component;
	}

	@Override
	public BookComponent remove(BookComponent component) {
		this.getChilds().remove(component);
		return component;
	}

	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		
		sb.append(print(this));
		
		Iterator<BookComponent> it = getChilds().iterator();
		
		while(it.hasNext()) {
			BookComponent component = it.next();
			sb.append(component.toString());
		}
		
		return sb.toString();
	}
	
}
