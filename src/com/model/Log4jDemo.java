package com.model;

import org.apache.log4j.Logger;
import org.apache.log4j.PropertyConfigurator;

public class Log4jDemo {

	static Logger logger=Logger.getLogger(Log4jDemo.class);
	public static void main(String[] args) {
		PropertyConfigurator.configure("log4j.properties");
		logger.info("Info message");
		logger.debug("Debug message");
		logger.error("Error message");
		logger.warn("warn message");
		logger.fatal("Fatal message");
		System.out.println("in Log4jDemo class github changes");
		System.out.println("pushing data from github to eclipse");
		//for Fatal message use try catch
		DivisionClass dc=new DivisionClass();
		try
		{
			int num1=90;
			int num2=0;
			dc.division(num1, num2);
		}
		catch (ArithmeticException e) 
		{
			int num1=90;
			int num2=2;
			dc.division(num1, num2);
			logger.fatal("Catch block is executed successfully");
		}
	}
}
