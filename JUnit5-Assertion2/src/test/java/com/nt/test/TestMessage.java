package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import com.nt.service.Message;

public class TestMessage{
	private Message m;
	private String expected;
	private String actual;

	@BeforeEach
	public void setup() {
		m=new Message();
		expected="Welcome to:  Mukesh";
		actual="";
	}
	@Test
	public void teshShowMsg() {
		actual=m.showMsg("Mukesh");
		assertEquals(expected, actual);
	}

	@AfterEach
	public void clean() {
		m=null;
		actual=expected=actual=null;
	}
}
