package com.nt.util;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
  public Connection getCon() {
	  Connection con=null;
	  try {
		  Class.forName("com.mysql.cj.jdbc.Driver");
		  con=DriverManager.getConnection("jdbc:mysql://localhost:3306/nareshit", "root", "football");
	  }
	  catch(Exception e) {
		  e.printStackTrace();
	  }
	  return con;
  }
}
