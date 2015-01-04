package org.yuanmomo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class NotPrint {
	private static Logger logger = LoggerFactory.getLogger(NotPrint.class);
	public static void print(){
		logger.warn(NotPrint.class + " not print");
	}
}
