package com.tcarlsen.web.model;

public class Garden {
	private double gardenWidth;
	private double gardenHeight;
	
	double getGardenArea() {
		return gardenWidth * gardenHeight;
	}
	
	double gardenAreaNeeded(Vegtables vegArry[]) {
		double sum = 0;
		for(Vegtables v: vegArry) {
			sum += v.areaNeeded();
		}
		return sum;
			
		}
	

}
