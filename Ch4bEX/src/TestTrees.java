//TestTrees.java
//Anderson Edmond
//09-26-2023

public class TestTrees {

	public static void main(String[] args) {
		Trees firstTree = new Trees();
		Trees secondTree = new Trees("Lodgepole pine", "coniferous", 150);
		
		printTrees(firstTree);
		printTrees(secondTree);
	}
	public static void printTrees(Trees newTree) {
		System.out.println(newTree.getSpecies() + "(s) are " + newTree.getClassification() 
		+ " and grow to an average height of " + newTree.getHeight() + " feet.");
	}
}
