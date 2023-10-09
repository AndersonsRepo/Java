
public class DogTriatholonParticipant {

	private final int NUM_EVENTS;
	private static int totalCumulativeScore = 0;
	private String name;
	private int obedienceScore;
	private int conformationScore;
	private int agilityScore;
	private int total;
	private double avg;
	
	public DogTriatholonParticipant(String name, int numEvents, int score1, int score2, int score3) {
		this.name = name;
		NUM_EVENTS = numEvents;
		obedienceScore = score1;
		conformationScore = score2;
		agilityScore = score3;
		
		total = obedienceScore + conformationScore + agilityScore;
		avg = (double)total / NUM_EVENTS;
		totalCumulativeScore = totalCumulativeScore + total;
	}
	public void display() {
		System.out.println(name + " participated in " + 
		NUM_EVENTS + " events and has an average score of " + avg);
		System.out.println("\n" + name + " has a total score of " + total +
		" bringing the total score to " + totalCumulativeScore);
		System.out.println("\nWhat a good job " + name + " did today! " + total + " is a lot of points!\n");
	}
}
