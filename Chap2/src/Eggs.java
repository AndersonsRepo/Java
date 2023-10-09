//Eggs.java
//Anderson Edmond
//08-30-2023

import java.util.Scanner;
public class Eggs {

	public static void main(String[] args) {
		//Variables for prices and totals
		final double PRICE_PER_DOZEN = 3.25;
		final double PRICE_PER_EGG = .45;
		double costTotal;
		int totalEggs;
		int dozenEggs;
		int looseEggs;
		int wholeNumber;
		
		//Retrieves user input for total number of eggs
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of eggs needed >> ");
		totalEggs = keyboard.nextInt();
		keyboard.close();
		
		//Calculates number of dozens of eggs and number of loose eggs
		dozenEggs = totalEggs / 12;
		looseEggs = totalEggs % 12;
		
		//Provides total cost for customer purchase
		costTotal = (PRICE_PER_DOZEN * dozenEggs) + (PRICE_PER_EGG * looseEggs);
		
        //Cost of egg in cents without decimal
		wholeNumber = (int)(PRICE_PER_EGG*100);
		
		//Displays calculated values
		System.out.printf("You ordered %,d eggs. That's %,d dozen eggs"
				+ " at $%,.2f and %,d loose eggs at %,d cents each"
				+ " for a total of $%,.2f.\n"
				, totalEggs, dozenEggs, PRICE_PER_DOZEN, looseEggs, wholeNumber, costTotal);
	}

}
