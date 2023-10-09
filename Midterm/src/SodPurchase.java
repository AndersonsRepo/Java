//SodPurchase.java
//Anderson Edmond
//10-03-2023

public class SodPurchase {
	//Variables to hold constructor inputs and constant tax rate
	final static double TAX_RATE = 0.0775;
	private int customerId;
	private String customerName;
	private String sodType;
	private double length;
	private double width;
	private double pricePerSquareFoot;
	
	//Custom constructor
	public SodPurchase(int customerId, String customerName, String sodType, double length, double width,
			double pricePerSquareFoot) {
		this.customerId = customerId;
		this.customerName = customerName;
		this.sodType = sodType;
		this.length = length;
		this.width = width;
		this.pricePerSquareFoot = pricePerSquareFoot;
	}
	
	public double calculateArea() {
		double area = length * width;
		return area;
	}
	
	public double calculateSubtotal(double area) {
		double subtotal = pricePerSquareFoot * area;
		return subtotal;
	}
	
	public double calculateGrandTotal(double subtotal) {
		double taxValue = subtotal * TAX_RATE;
		double grandTotal = subtotal + taxValue;
		return grandTotal;
	}
	
	public void displayInfo(double squareFoot, double subtotal, double grandTotal) {
		System.out.printf("Customer ID  : %d\n", getCustomerId());
		System.out.printf("Customer Name: %s\n", getCustomerName());
		System.out.printf("Sod Type     : %s\n", getSodType());
		System.out.printf("Area         : %,.2f square feet\n", squareFoot);
		System.out.printf("Subtotal     : $%,.2f\n", subtotal);
		System.out.printf("Grand Total  : $%,.2f\n\n", grandTotal);
	}
	
	//Getters and setters for values in class
	public int getCustomerId() {
		return customerId;
	}

	public void setCustomerId(int customerId) {
		this.customerId = customerId;
	}

	public String getCustomerName() {
		return customerName;
	}

	public void setCustomerName(String customerName) {
		this.customerName = customerName;
	}

	public String getSodType() {
		return sodType;
	}

	public void setSodType(String sodType) {
		this.sodType = sodType;
	}

	public double getLength() {
		return length;
	}

	public void setLength(double length) {
		this.length = length;
	}

	public double getWidth() {
		return width;
	}

	public void setWidth(double width) {
		this.width = width;
	}

	public double getPricePerSquareFoot() {
		return pricePerSquareFoot;
	}

	public void setPricePerSquareFoot(double pricePerSquareFoot) {
		this.pricePerSquareFoot = pricePerSquareFoot;
	}

	public static double getTaxRate() {
		return TAX_RATE;
	}
	
}
