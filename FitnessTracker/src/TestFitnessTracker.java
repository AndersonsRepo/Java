//TestFitnessTracker.java
//Anderson Edmond
//09-29-2023

import java.util.Scanner;
import java.time.LocalDate;

public class TestFitnessTracker {
	final static Scanner KEYBOARD = new Scanner(System.in);
	
	public static void main(String[] args) {
		FitnessTracker tracker1 = new FitnessTracker();
		FitnessTracker tracker2 = new FitnessTracker();
		
		tracker1 = getData();
		
		
		KEYBOARD.close();
	}
	public static FitnessTracker getData() {
		FitnessTracker tempTracker = new FitnessTracker();
		
		String activity;
		int minutes;
		LocalDate date;
		
		System.out.print("Please provide the name of the activity >> ");
		activity = KEYBOARD.nextLine();
		System.out.print("Please provide the number of minutes for the activity >> ");
		minutes = KEYBOARD.nextInt();
		KEYBOARD.nextLine();
		System.out.print("Please provide the start date of the activity(format yyyy-MM-dd) >> ");
		String dateString = KEYBOARD.nextLine();
		date = LocalDate.parse(dateString);
		
		tempTracker.setActivity(activity);
		tempTracker.setMinutes(minutes);
		tempTracker.setTodaysDate(date);
		return tempTracker;
	}
	public static void showData(TestTracker aTracker) {
		System.out.print("Your activity is: ... ");
	}
}
