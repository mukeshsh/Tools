package com.nt.test;

public class MathOperations {
	public int sum(int a,int b) {
		return a+b;
	}

	public static void main(String[] args) {
    MathOperations opertaions=null;
    opertaions=new MathOperations();
    System.out.println("Results is ::"+opertaions.sum(100, 300));
	}
}
