package org.pilot.refact.step01.movie;

import lombok.Getter;
import lombok.Setter;


public abstract class Movie {
	@Getter @Setter
	protected String title;
	
	public Movie(String title) {
		// TODO Auto-generated constructor stub
		this.title = title;
	}
	
	public abstract MovieCategory getPriceCode();
	
	public abstract double getPrice(int rentDay);
	
	public int getPoints(int rentDay){
		return 1;
	}
	
	@Override
	public String toString() {
		return "Movie [title=" + title + ", priceCode=" + getPriceCode() + "]";
	}
}
