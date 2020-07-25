package com.nt.test;

import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.RepeatedTest;
import org.junit.jupiter.api.TestInfo;

public class MultipleTest{
	@RepeatedTest(value=3,name="{displayName}")
	@DisplayName("Testing")
	public void testMultiple(TestInfo info) {
		//System.out.println("Hello::"+info.getDisplayName().getClass());
		//System.out.println("Hello::"+info.getTestMethod().get().getName());
		System.out.println("Hello::"+info.getDisplayName());
		
	}
	}
