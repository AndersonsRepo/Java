import java.util.Scanner;

public class PracticeSandwhich {

	public static void main(String[] args) {
	Sandwhich delicious = new Sandwhich();	
	Scanner keyboard = new Scanner(System.in);
	
	System.out.print("Please enter your meat selection >> ");
	String meat = keyboard.nextLine();
	delicious.setMeat(meat);
	
	System.out.print("Please enter your bread selection >> ");
	String bread = keyboard.nextLine();
	delicious.setBread(bread);
	
	System.out.print("Please enter your price >> ");
	double price = keyboard.nextInt();
	delicious.setPrice(price);
	
	keyboard.close();
	
	System.out.printf("Your sandwhich has " + meat + " for meat, " 
			+ bread + " for bread, " + "and will cost $" + price + ".");
	}

}
