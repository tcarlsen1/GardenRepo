package com.tcarlsen.web;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet(value = "/calculateAreaNeeded") 
public class CalculateGardenAreaController extends HttpServlet {
	
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		double cornQ = Double.parseDouble(request.getParameter("corn"));
		double tomatoQ = Double.parseDouble(request.getParameter("tomato"));
		double spinachQ = Double.parseDouble(request.getParameter("spinach"));
		double gLength = Double.parseDouble(request.getParameter("gLength"));
		double gWidth = Double.parseDouble(request.getParameter("gWidth"));
	}

}
