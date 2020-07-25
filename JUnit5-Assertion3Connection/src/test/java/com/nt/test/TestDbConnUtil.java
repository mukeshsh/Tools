package com.nt.test;

import static org.junit.jupiter.api.Assertions.assertNotNull;
import static org.junit.jupiter.api.Assertions.assertSame;
import static org.junit.jupiter.api.Assertions.fail;

import java.sql.Connection;

import org.junit.jupiter.api.Test;

import com.nt.util.DbConnUtil;

public class TestDbConnUtil {
    
	@Test
	public void testGetCon() {
		Connection con1=DbConnUtil.getCon1();
		Connection con2=DbConnUtil.getCon1();
	//	assertNotNull(con1,"Conection not created::");
		if(con1==null ||con2==null)
			fail();
		assertSame(con1, con2);
	}
}

