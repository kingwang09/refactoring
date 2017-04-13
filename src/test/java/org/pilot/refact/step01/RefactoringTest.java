package org.pilot.refact.step01;

import org.junit.Before;
import org.junit.Test;
import org.pilot.refact.step01.movie.ChildrenMovie;
import org.pilot.refact.step01.movie.Movie;
import org.pilot.refact.step01.movie.NewReleaseMovie;
import org.pilot.refact.step01.movie.RegularMovie;


public class RefactoringTest {
	
	private Customer customer = new Customer("진형은");
	
	@Before
	public void before(){
		Movie movie1 = new NewReleaseMovie("Test1");
		Movie movie2 = new RegularMovie("Test2");
		Movie movie3 = new ChildrenMovie("Test3");
		
		Rental rental1_1 = new Rental(movie1, 1);
		Rental rental1_2 = new Rental(movie1, 2);
		Rental rental1_3 = new Rental(movie1, 3);
		
		Rental rental2_1 = new Rental(movie2, 1);
		Rental rental2_2 = new Rental(movie2, 2);
		Rental rental2_3 = new Rental(movie2, 3);
		
		Rental rental3_1 = new Rental(movie3, 1);
		Rental rental3_2 = new Rental(movie3, 2);
		Rental rental3_3 = new Rental(movie3, 3);
		
		customer.addRental(rental1_1);
		customer.addRental(rental1_2);
		customer.addRental(rental1_3);
		
		customer.addRental(rental2_1);
		customer.addRental(rental2_2);
		customer.addRental(rental2_3);
		
		customer.addRental(rental3_1);
		customer.addRental(rental3_2);
		customer.addRental(rental3_3);
	}
	
	@Test
	public void test01(){
		System.out.println(customer.getRentals().size());
		System.out.println(customer.getStatements());
	}
}
