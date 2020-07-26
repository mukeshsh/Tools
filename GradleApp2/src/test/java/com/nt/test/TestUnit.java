package com.nt.test;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

import com.nt.util.MathOperations;

public class TestUnit {
	@Test
      public void testPossitives() {
	   int expected=300;
	   int actual=new MathOperations().sum(200, 100);
	   assertEquals("Possitives",expected,actual);
   }
	
	@Test
    public void testNegatives() {
	   int expected=-300;
	   int actual=new MathOperations().sum(-200, -100);
	   assertEquals("Negatives",expected,actual);
 }
	@Test
    public void testMix() {
	   int expected=100;
	   int actual=new MathOperations().sum(200, -100);
	   assertEquals("Mixes",expected,actual);
 }
	@Test
    public void testZeros() {
	   int expected=0;
	   int actual=new MathOperations().sum(0, 0);
	   assertEquals("Zeros",expected,actual);
 }
}
