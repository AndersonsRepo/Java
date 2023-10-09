
public class SodEmporium {

	public static void main(String[] args) {
		double area1;
		double area2;
		
		double subtotal1;
		double subtotal2;
		
		double grandTotal1;
		double grandTotal2;
		
		SodPurchase purchase1 = new SodPurchase(983465, "Fairway Golf", "Bermuda Tifway", 999.5, 850.55, 0.95);
		SodPurchase purchase2 = new SodPurchase(495301, "Jack’s Stables", "Kentucky Bluegrass", 60.0, 90.5, 0.65);
		
		area1 = purchase1.calculateArea();
		area2 = purchase2.calculateArea();
		
		subtotal1 = purchase1.calculateSubtotal(area1);
		subtotal2 = purchase2.calculateSubtotal(area2);
		
		grandTotal1 = purchase1.calculateGrandTotal(subtotal1);
		grandTotal2 = purchase2.calculateGrandTotal(subtotal2);
		
		purchase1.displayInfo(area1, subtotal1, grandTotal1);
		purchase2.displayInfo(area2, subtotal2, grandTotal2);
	}

}
