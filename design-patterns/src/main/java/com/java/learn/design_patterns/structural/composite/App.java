package com.java.learn.design_patterns.structural.composite;

public class App {
	public static void main(String[] args) {
		BookComponent allChpt = new BookChapter("Ciucales", "/root");
		allChpt.add(new BookPage("page1", "/page1"));
		
		BookComponent chapter1 = new BookChapter("suchp2", "/subchp2");
		chapter1.add(new BookPage("page2", "/page2"));
		
		allChpt.add(chapter1);
		
		System.out.println(allChpt.toString());
		
		System.out.println("\n" + chapter1.toString());
	}
}
