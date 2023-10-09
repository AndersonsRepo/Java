import java.util.Scanner;
public class CreateSpaServices2 {

	public static void main(String[] args) {
		
		SpaService firstService = new SpaService();
		SpaService secondService = new SpaService();
		SpaService thirdService = new SpaService("facial", 22.99);
		firstService = getData(firstService);
		//secondService = getData(secondService);
	
		
		System.out.println("First Service details: ");
		System.out.println(firstService.getServiceDescription() + " $"
				+ firstService.getPrice());
		
		System.out.println("Second Service details: ");
		System.out.println(secondService.getServiceDescription() + " $"
				+ secondService.getPrice());
		
		System.out.println("Third Service details: ");
		System.out.println(thirdService.getServiceDescription()
				+ " $" + thirdService.getPrice());
	}
	public static SpaService getData(SpaService service) {
		String serviceDescription;
		double price;
		Scanner keyboard = new Scanner(System.in);
		
		System.out.print("Please enter a service name >> ");
		serviceDescription = keyboard.nextLine();
		System.out.print("Please enter a price >> ");
		
		price = keyboard.nextDouble();
		keyboard.nextLine();
		
		service.setServiceDescription(serviceDescription);
		service.setPrice(price);
		return service;
	}
}
