package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

import org.junit.jupiter.api.Test;

public class TestSample {
	@Test
  public void testSample() {
	  int expected[]= {12,23,34};
	  int actual[]= {12,23,34};
	  
	  assertArrayEquals(expected, actual);
  }
}
 