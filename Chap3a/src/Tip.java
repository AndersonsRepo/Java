//Tip.java
//Anderson Edmond
//09-09-2023

import java.util.Scanner;

public class Tip {

	public static void main(String[] args) {
		
		//Variables for user input
		double subTotal;
		int tipPercentage;
		double tipAmount;
		double totalWithTip; 
		
		//Scanner method to handle user input
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Enter the subtotal for your restaurant bill >> ");
		subTotal = keyboard.nextDouble();
		
		
		System.out.print("Enter the tip percentage you want calculated >> ");
		tipPercentage = keyboard.nextInt();
		
		keyboard.close();
		
		//Variables to store methods results
		tipAmount = calcTip(subTotal, tipPercentage);
		totalWithTip = calcTotal(subTotal, tipAmount);
		
		display(subTotal, tipPercentage, tipAmount, totalWithTip);
		
	}
	//Method to convert int to double value and calculate tip amount
	public static double calcTip(double subTotal,int tipPercentage) {
		double decimalTip = (double)(tipPercentage * .01);
		double tipAmount = subTotal * decimalTip;
		return tipAmount;
	}
	//Method to calculate the total with tip included
	public static double calcTotal(double subTotal, double tipAmount) {
		double totalWithTip = subTotal + tipAmount;
		return totalWithTip;
	}
	//Method to display variable values and result of calculations
	public static void display(double subTotal, int tipPercentage, double tipAmount, double totalWithTip) {
		System.out.printf("Subtotal of the restaurant bill is $%,.2f. With a %d%% the"
				+ " tip would be $%,.2f and the total would be $%,.2f.", subTotal, tipPercentage, tipAmount, totalWithTip);
	}
}
