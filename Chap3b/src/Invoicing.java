//Invoicing.java
//Anderson Edmond
//09-12-2023

public class Invoicing {

	public static void main(String[] args) {
		
		//Variables to hold calculation values and tax constant
		final double TAX_RATE = 0.08;
		double invoiceTotal1 = computeInvoice(TAX_RATE, 24.95);
		double invoiceTotal2 = computeInvoice(TAX_RATE, 17.50, 4);
		double invoiceTotal3 = computeInvoice(TAX_RATE, 10.00, 6, 20.00);
		
		//Calls methods to display invoice totals
		displayDetails(invoiceTotal1);
		displayDetails(invoiceTotal2);
		displayDetails(invoiceTotal3);
	}
	
	//Methods to compute different numbers of parameters
	public static double computeInvoice(final double TAX_RATE, double bookPrice) {
		double taxDue = bookPrice * TAX_RATE;
		double totalPrice = bookPrice + taxDue;
		return totalPrice;
	}
	public static double computeInvoice(final double TAX_RATE, double bookPrice, int quantity) {
		double bookCost = bookPrice * quantity;
		double taxDue = bookCost * TAX_RATE;
		double totalPrice = bookCost + taxDue;
		return totalPrice;
	}
	public static double computeInvoice(final double TAX_RATE, double bookPrice, int quantity, double coupon) {
		double bookCost = (bookPrice * quantity) - coupon;
		double taxDue = bookCost * TAX_RATE;
		double totalPrice = bookCost + taxDue;
		return totalPrice;
	}
	
	//Method to display invoice total
	public static void displayDetails(double invoiceTotal) {
		System.out.printf("Total $%,.2f\n\n", invoiceTotal);
	}
}
