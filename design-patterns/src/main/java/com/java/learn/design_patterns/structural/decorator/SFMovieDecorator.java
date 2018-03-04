package com.java.learn.design_patterns.structural.decorator;

public class SFMovieDecorator extends MovieDecorator {

	public SFMovieDecorator(Movie customMovie) {
		super(customMovie);
	}

	@Override
	public String getGenre() {
		return " + SF";
	}

}
