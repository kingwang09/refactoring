package org.pilot.refact.step01;

import lombok.Getter;
import lombok.Setter;


public class Movie {
	public static final int REGULAR = 0;
	public static final int NEW = 1;
	public static final int CHILD = 2;
	
	@Getter @Setter
	private String title;
	@Getter @Setter
	private int priceCode;
	
	public Movie(String title, int priceCode) {
		// TODO Auto-generated constructor stub
		this.title = title;
		this.priceCode = priceCode;
	}

	@Override
	public String toString() {
		return "Movie [title=" + title + ", priceCode=" + priceCode + "]";
	}
}
