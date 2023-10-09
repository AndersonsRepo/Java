//TestScores.java
//Anderson Edmond
//09-27-2023

public class TestScores {

	public static void main(String[] args) {
		int total1;
		int total2;
		
		double average1;
		double average2;
		
		
		Student student1 = new Student("FC46728", 98, 92, 93);
		Student student2 = new Student("FC98574", 86, 90, 74);
		
		total1 = student1.computeTotal();
		average1 = student1.computeAverage(total1);
		
		total2 = student2.computeTotal();
		average2 = student2.computeAverage(total2);
		
		student1.displayInfo(total1, average1);
		student2.displayInfo(total2, average2);
	}

}
