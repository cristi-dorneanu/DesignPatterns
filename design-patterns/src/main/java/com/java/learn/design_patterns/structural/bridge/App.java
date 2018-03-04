package com.java.learn.design_patterns.structural.bridge;

public class App {
	public static void main(String[] args) {
		Book book = new Book("Nebunia lui Ciuc", "Ciuc Tiberiu");
		
		Printer printer = new BookPrinter(book);
		Formatter textFormatter = new TextFormatter();
		
		System.out.println(printer.write(textFormatter));
	}
}
