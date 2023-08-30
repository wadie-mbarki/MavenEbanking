package testCases;



import org.testng.annotations.Test;

import java.io.IOException;

import org.testng.Assert;

import pageObject.LoginPage;

public class TC_LoginTest_001 extends BaseClass
{
	@Test
	public void loginTest() throws InterruptedException, IOException
	{
		
		logger.info("url is opened");
		Thread.sleep(1000);
		LoginPage lp = new LoginPage(driver);
		lp.setUsername(username);
		logger.info("username is insered");
		lp.setPassword(password);
		logger.info("password is insered");
		lp.clickSubmit();
		logger.info("login button is clicked");
		if(driver.getTitle().equals("Guru99 Bank Manager HomePage "))
		{
			System.out.println("test reussi");
			Assert.assertTrue(true);
			logger.info("login is passed");
		}
		else
		{
			System.out.println("test fail");
			captureScreen(driver, "loginTest");
			Assert.assertTrue(false);
		    logger.info("login is failed");
		}
		
	}

}
