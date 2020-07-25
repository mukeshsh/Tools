package com.nt.test;

import org.apache.log4j.Logger;

public class Test {
	private static Logger logger=Logger.getLogger(Test.class);
	public static void main(String[] args) {
		//Log4j Properties
         logger.debug("Mukesh");
         logger.info("From");
         logger.warn("Mariahu");
         logger.error("jaunpur");
         logger.fatal("Uttar");
	}

}
