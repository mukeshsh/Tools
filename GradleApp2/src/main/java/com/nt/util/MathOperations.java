package com.nt.util;

public class MathOperations {
	public int sum(int a,int b) {
		return a+b;
	}
      public static void main(String[] args) {
		MathOperations operations=null;
		operations=new MathOperations();
		System.out.println("Result is ::"+operations.sum(100, 300));
	}
}
