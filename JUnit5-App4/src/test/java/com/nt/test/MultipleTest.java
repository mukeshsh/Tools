package com.nt.test;

import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class MultipleTest{
	@Test
	@Tag("dev")
	public void testMultiple() {
	System.out.println("Test-A");
	}
	@Test
	@Tag("pro")
	public void setMultiple() {
		System.out.println("Test-B");
	}
	}
