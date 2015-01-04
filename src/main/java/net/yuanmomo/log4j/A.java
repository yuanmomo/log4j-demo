package net.yuanmomo.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.yuanmomo.NotPrint;

public class A {
	private static Logger logger1 = LoggerFactory.getLogger("A1");
	private static Logger logger2 = LoggerFactory.getLogger("A2");
	private static Logger logger3 = LoggerFactory.getLogger(A.class);
	
	public static void main(String[] args) {
		logger1.error("info----1");
		logger2.error("info-----2");
		logger3.debug("info------3");
		NotPrint.print();
		Print.print();
	}
}
