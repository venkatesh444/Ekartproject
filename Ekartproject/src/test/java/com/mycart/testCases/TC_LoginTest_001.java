package com.mycart.testCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.mycart.pageObjects.LoginPage;

public class TC_LoginTest_001 extends BaseClass {

	@Test
	public void loginTest() {
		
		driver.get(baseUrl);
		
		logger.info("URL is opened");
		/*LoginPage lp=new LoginPage(driver);
		lp.setUserName(userName);
		logger.info("Username entered");
		lp.setPassword(password);
		logger.info("Password entered");
		lp.clickSubmit();
		logger.info("Button clicked");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage")) {
			Assert.assertTrue(true);
		}
		else {
			Assert.assertTrue(false);
		}*/
	}
	
}
