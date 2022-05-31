package com.pageobjectbank;

import org.junit.Assert;
import org.testng.annotations.Test;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	private void loginTest() {

		driver.get(baseURL);
		logger.info("URL is opened");

		LoginPage l = new LoginPage(driver);
		l.setUser(username);
	logger.info("Entered username");
	
	l.setPwd(password);
	logger.info("Entered password");
	l.setLog();
	
	

		if (driver.getTitle().equals("GTPL Bank Home Page")) {
			Assert.assertTrue(true);

		} else {
			Assert.assertFalse(false);
		}
	}

}
