import javax.swing.JOptionPane;
import java.time.*;

public class TimedResponse {

	public static void main(String[] args) {
		//Creates a datetime object to save to
		LocalDateTime time1;
		LocalDateTime time2;
		
		//
		int seconds1;
		int seconds2;
		int difference;
		
		time1 = LocalDateTime.now();
		seconds1 = time1.getSecond();
		
		JOptionPane.showConfirmDialog(null, "Is stealing justified? ");
		
		time2 = LocalDateTime.now();
		seconds2 = time2.getSecond();
		
		difference = seconds2 - seconds1;
		JOptionPane.showConfirmDialog(null, "End seconds: " + seconds1
				+ "\nStart seconds: " + seconds2 + "\nIt took " + difference
				+ " seconds for you to answer.");
	}

}
