package com.nt.util;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class DbConnUtil {
	private static Connection con=null;
     static {
    	 try {
    		 Class.forName("com.mysql.cj.jdbc.Driver");
    	 }
    	 catch(ClassNotFoundException cnf) {
    		 cnf.printStackTrace();
    	 }
    	 try {
    	con=	DriverManager.getConnection("jdbc:mysql://localhost:3306/nareshit","root","football");
    	 }
    	 catch(SQLException sql) {
    		 sql.printStackTrace();
    	 }
     }
     public static Connection getCon1() {
    	 return con;
    	 }
}
