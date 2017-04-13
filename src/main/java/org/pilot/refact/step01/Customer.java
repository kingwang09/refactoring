package org.pilot.refact.step01;

import java.util.Vector;

import org.pilot.refact.step01.movie.Movie;

import lombok.Getter;

public class Customer {
	
	@Getter
	private String name;
	@Getter
	private Vector<Rental> rentals = new Vector<Rental>();
	
	public Customer(String name) {
		// TODO Auto-generated constructor stub
		this.name = name;
	}
	
	public void addRental(Rental rental){
		rentals.addElement(rental);
	}
	
	public String getStatements(){
		StringBuilder result = new StringBuilder();
		result.append(name).append(" 고객님의 대여기록\n");
		for(Rental rental : rentals){
			int rentDay = rental.getDayRent();
			result.append("\t").append(rental.getMovie().getTitle()).append("\t")
				  .append(rental.getMovie().getPrice(rentDay)).append("\n");
		}
		result.append("누적 대여료 : ").append(getTotalAmount()).append("\n")
			  .append("적립 포인트 : ").append(getTotalPoint());
		return result.toString();
	}
	
	//대여로 계산
	private double getTotalAmount(){
		double result = 0;
		for(Rental rental : rentals){
			result += rental.getMovie().getPrice(rental.getDayRent());
		}
		return result;
	}
	
	private int getTotalPoint(){
		int rentalPoints = 0;
		for(Rental rental : rentals){
			rentalPoints += rental.getMovie().getPoints(rental.getDayRent());
		}
		return rentalPoints;
	}
}
