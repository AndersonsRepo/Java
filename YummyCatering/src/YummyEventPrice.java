import java.util.Scanner;
public class YummyEventPrice {

	public static void main(String[] args) {
		int guests;
		final int pricePerPerson = 35;
		int totalCost;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter number of attending guests >> ");
		guests = keyboard.nextInt();
		keyboard.close();
		
		totalCost = guests * pricePerPerson;
		YummyMoto2.printCompanyMotto();
		
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
