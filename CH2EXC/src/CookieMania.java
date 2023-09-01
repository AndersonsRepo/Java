//CookieMania.java
//Anderson Edmond
//08-29-23
import java.util.Scanner;
public class CookieMania {

	public static void main(String[] args) {
		final double CHOCOLATE_CHIP_PRICE = 3.50;
		final double OATMEAL_RAISIN_PRICE = 2.00;
		int numberChocChip;
		int numberOatmeal;
		double totalChocChip;
		double totalOatmeal;
		double allCookiesTotal;
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter number of boxes of Chocolate Chip cookies ordered >> ");
		numberChocChip = keyboard.nextInt();
		System.out.print("Enter number of boxes of Oatmeal cookies ordered >> ");
		numberOatmeal = keyboard.nextInt();
		keyboard.close();
		
		totalChocChip = numberChocChip * CHOCOLATE_CHIP_PRICE;
		totalOatmeal = numberOatmeal * OATMEAL_RAISIN_PRICE;
		allCookiesTotal = totalChocChip + totalOatmeal;
		
		System.out.printf("%,d boxes of Chocolate Chip Cookies ordered at $%,.2f each.\n",numberChocChip,CHOCOLATE_CHIP_PRICE);
		System.out.printf("\tTotal is $%,.2f", totalChocChip);
		System.out.println();
		System.out.printf("%,d boxes of Oatmeal Cookies ordered at $%,.2f each.\n",numberOatmeal,OATMEAL_RAISIN_PRICE);
		System.out.printf("\tTotal is $%,.2f", totalOatmeal);
		System.out.println();
		System.out.printf("Grand total for all boxes of cookies ordered is $%,.2f",allCookiesTotal);
	}

}
