package com.tcarlsen.web.model;

public class Plant implements PlantInterface {
	private double spaceBetweenPlants;
	private double spaceBetweenRows;
	private int amountOfPlants;
	private String name;
	private final int sidesOfThePlant = 2;
	

void setSpaceBetwenPlants(double SBP) {spaceBetweenPlants = SBP;}
void setSpaceBetweenRows(double SBR) {spaceBetweenRows = SBR;}
void setAmountOfPlants(int AOP) {amountOfPlants = AOP;}
void setNameOfPlant(String name) {name = name;}


public double lengthNeeded() {
	
	return spaceBetweenPlants * sidesOfThePlant * amountOfPlants;
}
public double widthNeeded() {

	return spaceBetweenRows * sidesOfThePlant * amountOfPlants;
}
public double areaNeeded() {
	
	return(spaceBetweenPlants / 12 * spaceBetweenRows /12) * amountOfPlants; 
}

}
