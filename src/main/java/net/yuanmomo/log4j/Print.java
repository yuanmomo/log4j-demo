package net.yuanmomo.log4j;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class Print {
	private static Logger logger = LoggerFactory.getLogger(Print.class);
	public static void print(){
		logger.warn(Print.class + " print");
	}
}
