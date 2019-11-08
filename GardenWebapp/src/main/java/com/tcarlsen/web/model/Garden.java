package com.tcarlsen.web.model;

public class Garden {
	private double gardenWidth;
	private double gardenLength;
	
public	void setGardenWidth(double GW) {gardenWidth = GW;}
public	void setGardenLength(double GH) {gardenLength = GH;}
	
public double getGardenArea() {
		return gardenWidth * gardenLength;
	}
	
public double gardenAreaNeeded(Vegetables vegArry[]) {
		double sum = 0;
		for(Vegetables v: vegArry) {
			sum += v.areaNeeded();
		}
		return sum;
			
		}
	

}
