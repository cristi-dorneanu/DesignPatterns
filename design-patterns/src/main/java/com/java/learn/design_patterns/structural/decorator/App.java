package com.java.learn.design_patterns.structural.decorator;

public class App {

	public static void main(String[] args) {
		Movie movie = new SFMovieDecorator(new DramaMovieDecorator(new ActionMovieDecorator(new SimpleMovie())));
		Movie movie2 = new DramaMovieDecorator(new SFMovieDecorator(new SimpleMovie()));
		Movie movie3 = new SFMovieDecorator(new SimpleMovie());
		
		System.out.println(movie.printGenre());
		System.out.println(movie2.printGenre());
		System.out.println(movie3.printGenre());
	}

}
