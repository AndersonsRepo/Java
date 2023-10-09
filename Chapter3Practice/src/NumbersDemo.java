//NumbersDemo.java
//Anderson Edmond
//9-10-2023

import java.util.Scanner;
public class NumbersDemo {

	public static void main(String[] args) {
		//Variables for user input
		int variableOne;
		int variableTwo;
		
		//Scanner method to prompt user input and store in variables
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter variable one >> ");
		variableOne = keyboard.nextInt();
		keyboard.nextLine();
		
		System.out.print("Please enter variable two >> ");
		variableTwo = keyboard.nextInt();
		keyboard.nextLine();
		keyboard.close();
		
		//Methods called to perform calculations
		displayTwiceTheNumber(variableOne, variableTwo);
		displayNumberPlusFive(variableOne, variableTwo);
		displayNumberSquared(variableOne, variableTwo);

	}
	//methods functions are displayed in header
	public static void displayTwiceTheNumber(int variableOne, int variableTwo){
		int oneVarDouble = variableOne * 2;
		int twoVarDouble = variableTwo * 2;
		System.out.printf("%,d times two equals %,d.\n", variableOne, oneVarDouble);
		System.out.printf("%,d times two equals %,d.\n", variableTwo, twoVarDouble);
	}
	public static void displayNumberPlusFive(int variableOne, int variableTwo){
		int oneVarPlusFive = variableOne + 5;
		int twoVarPlusFive = variableTwo + 5;
		System.out.printf("%,d plus five equals %,d.\n", variableOne, oneVarPlusFive);
		System.out.printf("%,d plus five equals %,d.\n", variableTwo, twoVarPlusFive);
	}
	public static void displayNumberSquared(int variableOne, int variableTwo){
		int oneVarSquared = variableOne * variableOne;
		int twoVarSquared = variableTwo * variableTwo;
		System.out.printf("%,d squared equals %,d.\n", variableOne, oneVarSquared);
		System.out.printf("%,d squared equals %,d.", variableTwo, twoVarSquared);
	}
}
