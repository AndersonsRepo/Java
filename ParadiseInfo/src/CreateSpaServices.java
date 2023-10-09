import java.util.Scanner;
public class CreateSpaServices {

	public static void main(String[] args) {
		String service;
		double price;
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		
		Scanner keyboard = new Scanner(System.in);
		System.out.print("Please enter Service type >> ");
		service = keyboard.nextLine();
		System.out.print("Please enter price >> ");
		price = keyboard.nextDouble();
		keyboard.nextLine();
		
		firstService.setServiceDescription(service);
		firstService.setPrice(price);
		
		System.out.print("Please enter Service type >> ");
		service = keyboard.nextLine();
		System.out.print("Please enter price >> ");
		price = keyboard.nextDouble();
		
		secondService.setServiceDescription(service);
		secondService.setPrice(price);
		
		System.out.println("First Service details: ");
		System.out.println(firstService.getServiceDescription() + " $"
				+ firstService.getPrice());
		
		System.out.println("Second Service details: ");
		System.out.println(secondService.getServiceDescription() + " $"
				+ secondService.getPrice());
		
	}

}
