package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;

import com.nt.util.MyClass;

public class TestSample1 {
	int expected=50;
	@Test
   public void testMultiply() {
	   MyClass actual=new MyClass();
	   actual.multiply(10, 5);
	   assertEquals(expected, actual);
   }
}
