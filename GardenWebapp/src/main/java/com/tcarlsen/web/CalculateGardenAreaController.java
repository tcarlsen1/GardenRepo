package com.tcarlsen.web;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import com.tcarlsen.web.DAO.GardenDAO;
import com.tcarlsen.web.model.*;





@WebServlet(value = "/calculateAreaNeeded") 
public class CalculateGardenAreaController extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		double areaOfGarden;
		double areaNeededForGarden;
		double differenceBetweenAreas;
		String output;
		
		int cornQ = Integer.parseInt(request.getParameter("corn"));
		int tomatoQ = Integer.parseInt(request.getParameter("tomato"));
		int spinachQ = Integer.parseInt(request.getParameter("spinach"));
		double gLength = Double.parseDouble(request.getParameter("gLength"));
		double gWidth = Double.parseDouble(request.getParameter("gWidth"));
		
		
		GardenDAO dao = new GardenDAO();
		
		Garden G1 = new Garden();
		Vegetables vegArry[] = new Vegetables[3];
		Vegetables corn = null;
		Vegetables RTomato = null;
		Vegetables spinach = null;
		
		G1.setGardenLength(gLength);
		G1.setGardenWidth(gWidth);
		
		if (cornQ > 0) {
		corn = dao.getVegtable("Corn", cornQ); 
	
		}
		
		if (tomatoQ > 0) {
			RTomato = dao.getVegtable("Roma Tomatoes", tomatoQ);
		
		}
		
		if (spinachQ > 0) {
			spinach = dao.getVegtable("Spinach", spinachQ);
			
		}
		
		vegArry[0] = corn;
		vegArry[1] = RTomato;
		vegArry[2] = spinach;
		
		areaOfGarden = G1.getGardenArea();
		
		areaNeededForGarden = G1.gardenAreaNeeded(vegArry);
		
		differenceBetweenAreas = areaOfGarden - areaNeededForGarden;
		
		if(differenceBetweenAreas < 0) {
			output = "The garden you are planning on planting is too large by " + Math.abs(differenceBetweenAreas) + " Square feet";
	}else {
			output = "The garden you are planning on planting is small enough to fit your plot by " + differenceBetweenAreas + " Square feet";
			
		}
		
		request.setAttribute("output", output);
		
		RequestDispatcher rd = request.getRequestDispatcher("/showGardenSizeResult.jsp");
	rd.forward(request, response); 
	}


}

