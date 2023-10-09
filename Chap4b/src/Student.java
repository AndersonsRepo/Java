//Student.java
//Anderson Edmond
//09-27-2023

public class Student {
	final static int TESTS = 3;
	private String studentID;
	private int test1;
	private int test2;
	private int test3;
	
	public Student(String studentID, int test1, int test2, int test3) {
		this.studentID = studentID;
		this.test1 = test1;
		this.test2 = test2;
		this.test3 = test3;
	}
	
	//Getters and setters
	public String getStudentID() {
		return studentID;
	}

	public void setStudentID(String studentID) {
		this.studentID = studentID;
	}

	public int getTest1() {
		return test1;
	}

	public void setTest1(int test1) {
		this.test1 = test1;
	}

	public int getTest2() {
		return test2;
	}

	public void setTest2(int test2) {
		this.test2 = test2;
	}

	public int getTest3() {
		return test3;
	}

	public void setTest3(int test3) {
		this.test3 = test3;
	}
	
	//Computation methods
	public int computeTotal() {
		return test1 + test2 + test3;
		
	}
	public double computeAverage(int total) {
		return (double)total / TESTS; 
	}
	//Displays info and results
	public void displayInfo(int total, double average) {
		System.out.printf("Student ID: %s\n", getStudentID());
		System.out.printf("\tTest 1 score: %,d\n", getTest1());
		System.out.printf("\tTest 2 score: %,d\n", getTest2());
		System.out.printf("\tTest 3 score: %,d\n", getTest3());
		System.out.printf("\tTotal\t    : %,d\n", total);
		System.out.printf("\tAverage\t    : %,.2f\n\n", average);
	}
}
