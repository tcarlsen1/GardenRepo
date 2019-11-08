package com.tcarlsen.web.model;

public class Plant implements PlantInterface {
	private double spaceBetweenPlants;
	private double spaceBetweenRows;
	private int amountOfPlants;
	private String name;
	private final int sidesOfThePlant = 2;
	

public void setSpaceBetwenPlants(double SBP) {spaceBetweenPlants = SBP;}
public void setSpaceBetweenRows(double SBR) {spaceBetweenRows = SBR;}
public void setAmountOfPlants(int AOP) {amountOfPlants = AOP;}
public void setNameOfPlant(String vname) {name = vname;}

public double getSpaceBetwenPlants() {return spaceBetweenPlants;}
public double getSpaceBetweenRows() {return spaceBetweenRows;}
public int getAmountOfPlants() {return amountOfPlants;}
public String getNameOfPlant() {return name;}

public double lengthNeeded() {
	
	return spaceBetweenPlants * sidesOfThePlant * amountOfPlants;
}
public double widthNeeded() {

	return spaceBetweenRows * sidesOfThePlant * amountOfPlants;
}
public double areaNeeded() {
	
	return(getSpaceBetwenPlants() / 12 * getSpaceBetweenRows() /12) * getAmountOfPlants(); 
}

}
