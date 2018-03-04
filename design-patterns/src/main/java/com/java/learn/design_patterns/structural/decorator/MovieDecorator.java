package com.java.learn.design_patterns.structural.decorator;

public abstract class MovieDecorator implements Movie {

	protected Movie customMovie;
	
	public MovieDecorator(Movie customMovie) {
		this.customMovie = customMovie;
	}
	
	@Override
	public String printGenre() {
		return customMovie.printGenre() + getGenre();
	}

	public abstract String getGenre();

}
