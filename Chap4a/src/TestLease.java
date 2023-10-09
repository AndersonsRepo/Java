//TestLease.java
//Anderson Edmond
//09-24-2023

import java.util.Scanner;
public class TestLease {
	final static Scanner KEYBOARD = new Scanner(System.in);
	
	public static void main(String[] args) {
		//Declares lease object identifiers
		Lease lease1;
		Lease lease2;
		Lease lease3;
		Lease lease4 = new Lease();
		
		//Instantiates the first 3 lease objects not using default constructor
		lease1 = getData();
		lease2 = getData();
		lease3 = getData();
		
		//Displays data for lease objects and pet fee
		showData(lease1);
		lease1.addPetFee();
		showData(lease1);
		showData(lease2);
		showData(lease3);
		showData(lease4);
		
		KEYBOARD.close();
	}
	//Retrieves user input for lease objects and assigns to each variable 
	public static Lease getData() {
		Lease newLease = new Lease();
		
		//Declares variable identifiers
		String lesseeName;
		int apartmentNumber;
		double rent;
		int leaseTermInMonths;
		
		//Prompts user for input and saves to variable identifiers
		System.out.print("Enter lessee name >> ");
		lesseeName = KEYBOARD.nextLine();
		System.out.print("Enter apartment number >> ");
		apartmentNumber = KEYBOARD.nextInt();
		KEYBOARD.nextLine();
		System.out.print("Enter rent >> ");
		rent = KEYBOARD.nextDouble();
		KEYBOARD.nextLine();
		System.out.print("Enter lease term in months >> ");
		leaseTermInMonths = KEYBOARD.nextInt();
		KEYBOARD.nextLine();
		System.out.println();
		
		//Sets new objects values from user input
		newLease.setLesseeName(lesseeName);
		newLease.setApartmentNumber(apartmentNumber);
		newLease.setRent(rent);
		newLease.setLeaseTermInMonths(leaseTermInMonths);
		
		return newLease;
	}
	
	//Creates public class to display object data
	public static void showData(Lease newLease) {
		System.out.println("Your lease results . . . ");
		System.out.println("Name       : " + newLease.getLesseeName());
		System.out.printf("Apartment  : %d\n", newLease.getApartmentNumber());
		System.out.printf("Rent       : $%,.2f\n", newLease.getRent());
		System.out.printf("Term       : %d\n\n", newLease.getLeaseTermInMonths());
	}
}
