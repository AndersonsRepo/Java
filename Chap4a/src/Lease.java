//Lease.java
//Anderson Edmond
//09-23-2023

public class Lease {
	//Variables called in methods and constructor
	final static double PET_FEE = 10;
	private String lesseeName;
	private int apartmentNumber;
	private double rent;
	private int leaseTermInMonths;
	
	//Default constructor
	public Lease() {
		lesseeName = "XXX";
		apartmentNumber = 0;
		rent = 1000;
		leaseTermInMonths = 12;
	}
	
	//Get and set methods for variables
	public String getLesseeName() {
		return lesseeName;
	}
	public void setLesseeName(String name) {
		lesseeName = name;
	}
	
	public int getApartmentNumber() {
		return apartmentNumber;
	}
	public void setApartmentNumber (int number) {
		apartmentNumber = number;
	}
	
	public double getRent() {
		return rent;
	}
	public void setRent(double rent) {
		this.rent = rent;
	}
	
	public int getLeaseTermInMonths() {
		return leaseTermInMonths;
	}
	public void setLeaseTermInMonths(int months) {
		leaseTermInMonths = months;
	}
	
	public void addPetFee() {
		rent = rent + PET_FEE;
		explainPetPolicy();
	}
	
	public static void explainPetPolicy() {
		System.out.printf("\nA pet fee of $%,.2f is added to the monthly rent.\n\n", PET_FEE);
	}
}
