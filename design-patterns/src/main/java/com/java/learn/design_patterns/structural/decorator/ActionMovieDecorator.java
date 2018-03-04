package com.java.learn.design_patterns.structural.decorator;

public class ActionMovieDecorator extends MovieDecorator {

	public ActionMovieDecorator(Movie customMovie) {
		super(customMovie);
	}

	@Override
	public String getGenre() {
		return " + Action";
	}

}
