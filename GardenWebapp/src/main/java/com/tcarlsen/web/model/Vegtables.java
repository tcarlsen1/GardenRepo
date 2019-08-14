package com.tcarlsen.web.model;

public class Vegtables extends Plant {
	
	Vegtables(double SBR, double SBP, int AOP, String vName){
		setSpaceBetwenPlants(SBP);
		setSpaceBetweenRows(SBR);
		setAmountOfPlants(AOP);
		setNameOfPlant(vName);
		
		
	}

}
