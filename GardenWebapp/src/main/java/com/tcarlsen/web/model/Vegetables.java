package com.tcarlsen.web.model;

public class Vegetables extends Plant {
	
	
	
	public Vegetables(double SBR, double SBP, int AOP, String vName){
		setSpaceBetwenPlants(SBP);
		setSpaceBetweenRows(SBR);
		setAmountOfPlants(AOP);
		setNameOfPlant(vName);
		
		
	}
	public Vegetables() {
		
	}
	

}
