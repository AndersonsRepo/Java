//FitnessTracker.java
//Anderson Edmond
//09-29-2023

import java.time.LocalDate;

public class FitnessTracker {
	private String activity;
	private int minutes;
	private LocalDate date;
	
	public String getActivity() {
		return activity;
	}
	public void setActivity(String activity) {
		this.activity = activity;
	}
	public int getMinutes() {
		return minutes;
	}
	public void setMinutes(int minutes) {
		this.minutes = minutes;
	}
	public LocalDate getTodaysDate() {
		return date;
	}
	public void setTodaysDate(LocalDate todaysDate) {
		this.date = todaysDate;
	}
	
	public FitnessTracker() {
		activity = "Running";
		minutes = 0;
		
		LocalDate currentDate = LocalDate.now();
		int currentYear = currentDate.getYear();
		
		date = LocalDate.of(currentYear, 01, 01);
	}
	public FitnessTracker(String activity, int minutes, LocalDate date) {
		this.activity = activity;
		this.minutes = minutes;
		this.date = date;
	}
}
