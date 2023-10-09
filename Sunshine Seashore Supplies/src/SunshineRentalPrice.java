import java.util.Scanner;
public class SunshineRentalPrice {

	public static void main(String[] args) {
		int minutes; 
		int hours;
		int remainingMinutes;
		int totalPrice;
		final int rentPerHour = 40;
		final int rentPerMinute = 1;
		
		System.out.print("Please enter the number of minutes you wish to rent >> ");
		
		Scanner keyboard = new Scanner(System.in);
		minutes = keyboard.nextInt();
		keyboard.close();
		
		remainingMinutes = minutes % 60;
		hours = minutes / 60;
		totalPrice = (rentPerHour * hours) + (rentPerMinute * remainingMinutes);
		
		SunshineMotto2.displayMotto();
		System.out.printf("\nYou are renting for %,d hours and %,d minutes."
				+ "\nYour total cost will be $%,d.", hours, remainingMinutes, totalPrice);
	}

}
