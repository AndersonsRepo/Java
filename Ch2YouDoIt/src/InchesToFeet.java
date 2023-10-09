
public class InchesToFeet {

	public static void main(String[] args) {
		int inches = 86;
		int feet = inches / 12;
		int remainder = inches % 12;
		
		System.out.printf("%,d inches is %,d feet and %,d inches total.", inches, feet, remainder);
		

	}

}
