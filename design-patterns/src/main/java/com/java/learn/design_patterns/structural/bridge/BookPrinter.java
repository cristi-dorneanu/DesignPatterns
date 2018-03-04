package com.java.learn.design_patterns.structural.bridge;

import java.util.ArrayList;
import java.util.List;

public class BookPrinter extends Printer{

	private Book book;
	
	public BookPrinter(Book book) {
		this.book = book;
	}

	@Override
	protected String getHeader() {
		return "This is a book";
	}

	@Override
	protected List<Detail> getDetails() {
		List<Detail> details = new ArrayList<>();
		
		details.add(new Detail("Name", this.book.getName()));
		details.add(new Detail("Author", this.book.getAuthor()));
		
		return details;
	}
	
}
