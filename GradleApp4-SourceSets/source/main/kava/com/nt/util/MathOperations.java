package com.nt.util;

import java.util.Scanner;

public class MathOperations {
	public int sum(int a,int b) {
		return a+b;
	}
      public static void main(String[] args) {
		MathOperations operations=null;
		Scanner sc=null;
		
		operations=new MathOperations();
		System.out.println("Result is ::"+operations.sum(100, 300));
		//read inputs
		sc=new Scanner(System.in);
		System.out.println("Enter Name::");
		String name=sc.next();
		System.out.println("Name::"+name);
		try {
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("driver loaded..........");
		}
		catch(Exception e) {
			e.printStackTrace();
		}
	}
}
