package com.nt.test;

import org.junit.jupiter.api.MethodOrderer.Alphanumeric;
import org.junit.jupiter.api.MethodOrderer.OrderAnnotation;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.TestMethodOrder;

//@TestMethodOrder(OrderAnnotation.class)
@TestMethodOrder(Alphanumeric.class)
public class Test1{
	@Test
	public void test1Save() {
		System.out.println("Save");
	}
	@Test
	public void tests2Update() {
		System.out.println("Update");
	}
	@Test
	public void test3Delete() {
		System.out.println("delete");
	}
}