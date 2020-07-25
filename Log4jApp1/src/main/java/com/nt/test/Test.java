package com.nt.test;

import org.apache.log4j.Appender;
import org.apache.log4j.ConsoleAppender;
import org.apache.log4j.HTMLLayout;
import org.apache.log4j.Layout;
import org.apache.log4j.Logger;
import org.apache.log4j.PatternLayout;
import org.apache.log4j.SimpleLayout;
import org.apache.log4j.xml.XMLLayout;

public class Test {
	private static Logger logger=Logger.getLogger(Test.class);
	public static void main(String[] args) {
		Layout layout=null;
		Appender appender=null;
		//create layout.......
		 //q layout=new SimpleLayout();
		  //layout=new HTMLLayout();
		//layout=new XMLLayout();
		layout=new PatternLayout("%p %d %C %M %m %n");
		  //create appender
         appender=new ConsoleAppender(layout);
         //link appender with logger
         logger.addAppender(appender);
         //print msg
         logger.debug("from debug");
         logger.info("from info");
         logger.warn("from warn");
         logger.error("from error");
         logger.fatal("from fatal");
	}

}
