package com.nt.test;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;

public class Test {
	private static Logger logger=Logger.getLogger(Test.class);
	public static void main(String[] args) {
		Layout layout=null;
		Appender appender=null;
		//create layout.......
		//layout=new PatternLayout("%p %d %C [%M] --%L %m %n");
		layout=new PatternLayout("%d{yyyy-MMM-dd  H:m:s:SSS}   %l %n" );
		  //create appender
         appender=new ConsoleAppender(layout);
         //link appender with logger
         logger.addAppender(appender);
         //print msg
         logger.debug("Mukesh Patel");
         logger.info("From Rajapur no1");
         logger.warn("Mariahu");
         logger.error("jaunpur");
         logger.fatal("Uttar Pradesh");
	}

}
