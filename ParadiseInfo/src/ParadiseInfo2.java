import java.util.Scanner;
public class ParadiseInfo2 {

	public static void main(String[] args) {
		
		double price;
		double discount;
		double savings;
		
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please provide a minimum discount value >> ");
		price = keyboard.nextDouble();
		
		System.out.print("Please enter the discount rate >> ");
		discount = keyboard.nextDouble();
		keyboard.close();
		
		System.out.println();
		displayInfo();
		savings = computeDiscountInfo(price,discount);
		
		System.out.printf("Special this week on anything over $%,.2f.\n", price);
		System.out.printf("Discount of %,.2f percent!\n", discount);
		System.out.printf("That's a savings of at least $%,.2f!", savings);
	}
	public static void displayInfo() {
		System.out.println("Paradise Day Spa wants to pamper you.");
		System.out.println("We will make you look good.\n");
	}
	public static double computeDiscountInfo(double price, double discount) {
		double savings;
		savings = price * discount/100;
		return savings;
	}
		
}
