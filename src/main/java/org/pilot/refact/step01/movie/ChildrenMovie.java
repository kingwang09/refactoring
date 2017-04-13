package org.pilot.refact.step01.movie;

public class ChildrenMovie extends Movie {

	public ChildrenMovie(String title) {
		super(title);
		// TODO Auto-generated constructor stub
	}

	@Override
	public MovieCategory getPriceCode() {
		// TODO Auto-generated method stub
		return MovieCategory.CHILD;
	}

	@Override
	public double getPrice(int rentDay) {
		// TODO Auto-generated method stub
		double result = 0;
		result += 1.5;
		if( rentDay > 3){
			result += (rentDay - 3) * 1.5;
		}
		return result;
	}

}
