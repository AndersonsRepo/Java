import java.util.Scanner;

public class YummyEventPriceWithMethods {

	public static void main(String[] args) {
		
		int guests = getGuestsNumber();
		YummyMoto2.printCompanyMotto();
		displayResult(guests);
	}
	
	
	//Stores number of guests requested
	public static int getGuestsNumber() {
		int guests;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter number of attending guests >> ");
		guests = keyboard.nextInt();
		keyboard.close();
		return guests;
	}
	//Shows reservation costs and details
	public static void displayResult(int guests) {
		final int pricePerPerson = 35;
		int totalCost;
		
		totalCost = guests * pricePerPerson;
		System.out.printf("\nThe numbers of guests attending is %,d. \nYour total comes out to "
				+ "$%,d.", guests, totalCost);
		if (guests >= 50) {
			System.out.print("\nThis is classified as a large event.");
		}
		else {
			System.out.print("\nThis is not classified as a large event.");
		}
	}
}
