package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;

public class AssertionTest{
	
	@Test
	 public void TestAssertion() {
		String expected="Mukessh";
		String actual="Mukesh";
		assertEquals(expected, actual,"May be value are not similar...........");
	}
	
	}
