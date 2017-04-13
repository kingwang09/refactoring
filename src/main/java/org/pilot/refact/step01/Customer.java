package org.pilot.refact.step01;

import java.util.Vector;

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
		
		double totalAmount = 0;
		int rentalPoints = 0;
		for(Rental rental : rentals){
			double amount = 0;
			
			amount = getTotalAmount(rental);
			
			//적립포인트 1
			rentalPoints = getPoint(rental);
			
			result.append("\t").append(rental.getMovie().getTitle()).append("\t")
				  .append(amount).append("\n");
			totalAmount += amount;
		}
		result.append("누적 대여료 : ").append(totalAmount).append("\n")
			.append("적립 포인트 : ").append(rentalPoints);
		return result.toString();
	}
	
	//대여로 계산
	private double getTotalAmount(Rental rental){
		double result = 0;
		switch(rental.getMovie().getPriceCode()){
			case Movie.REGULAR :
				result += 2;
				if( rental.getDayRent() > 2){
					result += (rental.getDayRent() - 2) * 1.5;
				}
				break;
			
			case Movie.NEW :
				result += rental.getDayRent() * 3;
				break;
			
			case Movie.CHILD :
				result += 1.5;
				if( rental.getDayRent() > 3){
					result += (rental.getDayRent() - 3) * 1.5;
				}
				break;
		}
		return result;
	}
	
	private int getPoint(Rental rental){
		int rentalPoints = 1;
		//최신을 대여시 보너스 추가 지급
		if(rental.getMovie().getPriceCode() == Movie.NEW && rental.getDayRent() > 1){
			rentalPoints++;
		}
		return rentalPoints;
	}
}
