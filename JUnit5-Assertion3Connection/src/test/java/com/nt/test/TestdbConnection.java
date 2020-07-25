package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertDoesNotThrow;
import static org.junit.jupiter.api.Assertions.assertNotNull;
import java.sql.Connection;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import com.nt.util.DBConnection;

public class TestdbConnection {
	private DBConnection dbc;
	private Connection con;

	@BeforeEach
	public void initData() {
		dbc=new DBConnection();
	}
	@Test
	public void testGetcon() {
		assertDoesNotThrow(()->{
		con=dbc.getCon();
		});
	}
		//assertNotNull(con,"Connection is Not created, check it again");
	
	@AfterEach
	public void clean() {
		dbc=null;
		con=null;
	}
}
