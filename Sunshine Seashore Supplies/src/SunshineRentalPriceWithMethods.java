import java.util.Scanner;

public class SunshineRentalPriceWithMethods {

	public static void main(String[] args) {
		int minutes = getMinutes();
		System.out.print("\n");
		SunshineMotto2.displayMotto();
		displayResult(minutes);
	}
	public static int getMinutes() {
		int minutes; 
		
		System.out.print("Please enter the number of minutes you wish to rent >> ");
		
		Scanner keyboard = new Scanner(System.in);
		minutes = keyboard.nextInt();
		keyboard.close();
		return minutes;
	}
	public static void displayResult(int minutes) {
		int hours;
		int remainingMinutes;
		int totalPrice;
		final int rentPerHour = 40;
		final int rentPerMinute = 1;
		
		remainingMinutes = minutes % 60;
		hours = minutes / 60;
		totalPrice = (rentPerHour * hours) + (rentPerMinute * remainingMinutes);
		
		System.out.printf("\nYou are renting for %,d hours and %,d minutes."
				+ "\nYour total cost will be $%,d.", hours, remainingMinutes, totalPrice);
	}
}
