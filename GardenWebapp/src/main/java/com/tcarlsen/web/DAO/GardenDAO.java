package com.tcarlsen.web.DAO;

import com.tcarlsen.web.model.Vegetables;
import java.sql.*;


public class GardenDAO {
	
	public Vegetables getVegtable(String vName, int AOP) {
		// when I create my object it wants me to construct it immediately 
		Vegetables v = new Vegetables();
		try {
			Class.forName("com.microsoft.sqlserver.jdbc.SQLServerDriver");
			Connection con = DriverManager.getConnection("jdbc:sqlserver://localhost;databaseName=GardenDatabase;integratedSecurity=true;");
			Statement st = con.createStatement();
			ResultSet rs = st.executeQuery("Select SpaceBetweenRows, SpaceBetweenPlants from VegetableSpacing where VegetableName = '" + vName +"'");
			if(rs.next())
			{
				 v.setNameOfPlant(vName);
				 v.setSpaceBetweenRows(rs.getDouble("SpaceBetweenRows"));
				 v.setSpaceBetwenPlants(rs.getDouble("SpaceBetweenPlants"));
				 v.setAmountOfPlants(AOP);
				 
			}
			
			
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
			
		}
		return v;
		
		
	}

}
