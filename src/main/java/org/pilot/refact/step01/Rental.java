package org.pilot.refact.step01;

import lombok.Getter;

public class Rental {
	@Getter
	private Movie movie;
	@Getter
	private int dayRent;
	
	
	public Rental(Movie movie, int dayRent) {
		this.movie = movie;
		this.dayRent = dayRent;
	}
}
