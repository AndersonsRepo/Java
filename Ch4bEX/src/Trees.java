//Trees.java
//Anderson Edmond
//09-26-2023

public class Trees {
	private String species;
	private String classification;
	private int height;
	
	//Custom default constructor
	public Trees() {
		species = "Aspen";
		classification = "deciduous";
		height = 75;
	}
	
	//Overloaded constructor method
	public Trees(String species, String classification, int height) {
		this.species = species;
		this.classification = classification;
		this.height = height;
	}
	
	//Get and set methods for class
	public String getSpecies() {
		return species;
	}
	public void setSpecies(String species) {
		this.species = species;
	}
	public String getClassification() {
		return classification;
	}
	public void setClassification(String classification) {
		this.classification = classification;
	}
	public int getHeight() {
		return height;
	}
	public void setHeight(int height) {
		this.height = height;
	}
}
