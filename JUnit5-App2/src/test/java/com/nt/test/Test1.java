package com.nt.test;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

@DisplayName("Testing Tes1")
public class Test1{
	@BeforeAll
	public static void setupOnce() {
		System.out.println("Setup Once");
	}
	@BeforeEach
	public void setup() {
		System.out.println("from setup");
	}
	@DisplayName("Testing on Updation")
	@Test
	public void testsUpdate() {
		System.out.println("Update");
	}
	@DisplayName("testing on deletion")
	@Test
	@Disabled
	public void testDelete() {
		System.out.println("delete");
	}
	
	  @AfterEach 
	     public void clear() {
		  System.out.println("Clear  Data");
		  }
	  @AfterAll
	  public static void closeOnce() {
		  System.out.println("Close Once");
	  }
	 
}