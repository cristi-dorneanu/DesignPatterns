package com.java.learn.design_patterns.structural.decorator;

public class DramaMovieDecorator extends MovieDecorator{

	public DramaMovieDecorator(Movie customMovie) {
		super(customMovie);
	}

	@Override
	public String getGenre() {
		return " + Drama";
	}

}
