package com.sapient.client.gui;

import java.sql.Connection;
import java.sql.DriverManager;

public class Connections {
	Connection dbConnection = null;
	
	public void connect() {
		try {
			DriverManager.registerDriver(new oracle.jdbc.driver.OracleDriver());
			dbConnection = DriverManager.getConnection("jdbc:oracle:thin:@deltahiti31202:1521:XE", "Harsh", "harsh19933");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}

}
