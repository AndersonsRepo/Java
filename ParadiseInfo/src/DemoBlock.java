
public class DemoBlock 
{

	public static void main(String[] args) 
	{
		System.out.println("Demonstrate block scope");
		int x = 1111;
		System.out.println("The first block is " + x); 
		{
			int y = 2222;
			System.out.println("In the second block x is " + x);
			System.out.println("In the second block y is " + y);
		}
			
		{
			int y = 3333;
			System.out.println("In the third block x is " + x);
			System.out.println("In the third block y is " + y);
			demoMethod();
			System.out.println("After the method call x is " + x);
			System.out.println("After the method call y is " + y);
		}
		
		System.out.println("At the end x is " + x);
		
	}
	public static void demoMethod()
	{
		int x = 8888;
		int y = 9999;
		System.out.println("In demoMethod x is " + x);
		System.out.println("In demoMethod y is " + y);
	}
}
