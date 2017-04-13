package org.pilot.refact.step01.movie;

public class NewReleaseMovie extends Movie {
	
	public NewReleaseMovie(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MovieCategory getPriceCode() {
		// TODO Auto-generated method stub
		return MovieCategory.NEW;
	}

	@Override
	public double getPrice(int rentDay) {
		// TODO Auto-generated method stub
		double result = 0;
		result += rentDay * 3;
		return result;
	}
	
	@Override
	public int getPoints(int rentDay){
		return rentDay > 1 ? 2 : 1;
	}

}
