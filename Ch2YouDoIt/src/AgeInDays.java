import java.util.Scanner;

public class AgeInDays 
{
    public static void man(String[] args) 
    {
    	int ageInYears;
        
    	Scanner keyboard = new Scanner(System.in);
    	ageInYears = keyboard.nextInt();
    	keyboard.close();
    	
    	int ageInDays = ageInYears * 365;
        System.out.println("You are about " + ageInDays + " days old.");
    }
}