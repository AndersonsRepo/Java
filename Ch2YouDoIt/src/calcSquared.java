import java.util.Scanner;
public class calcSquared {

	public static void main(String[] args) {
		int num1;
		int squaredNumber;
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter a number >> ");
		num1 = keyboard.nextInt();
		System.out.println("The number entered was " + num1);
		squaredNumber = calcSquared(num1);
		System.out.println("I am back in the main method.");
		
		System.out.printf("The square of %,d is %,d.", num1, squaredNumber);
		keyboard.close();
	}
	public static int calcSquared(int number) {
		int squared;
		squared = number * number;
		
		System.out.println("I will be returning the square to the main method.");
	    return squared;
	}
}
