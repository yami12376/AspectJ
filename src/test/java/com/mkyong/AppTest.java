package com.mkyong;

import org.junit.Assert;
import org.junit.Test;
import org.apache.log4j.Level;
import org.apache.log4j.LogManager;
import org.apache.log4j.Logger;
import org.apache.log4j.Priority;

public class AppTest {
	
	 private static final Logger logger = LogManager.getLogger(AppTest.class);

	@Test
	public void testLengthOfTheUniqueKey() {
		
		logger.log(Priority.DEBUG, "test log debug");

		App obj = new App();
		Assert.assertEquals(36, obj.generateUniqueKey().length());

	}
}
