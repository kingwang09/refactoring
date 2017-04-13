package org.pilot.refact.step01.movie;

public class RegularMovie extends Movie {

	public RegularMovie(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MovieCategory getPriceCode() {
		// TODO Auto-generated method stub
		return MovieCategory.REGULAR;
	}

	@Override
	public double getPrice(int rentDay) {
		// TODO Auto-generated method stub
		double result = 0;
		result += 2;
		if( rentDay > 2){
			result += (rentDay - 2) * 1.5;
		}
		return result;
	}

}
