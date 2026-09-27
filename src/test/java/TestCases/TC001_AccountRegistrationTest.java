package TestCases;


import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.Registrationpage;
import PageObject.homepage;
import TestBase.BaseClass;


public class TC001_AccountRegistrationTest extends BaseClass {

	
 
	@Test(groups={"Regression","master"})
	public void verify_account_registration()
	{
		logger.info("**** starting  TC001_AccountRegistrationTest ****");
		try {
		homepage hp=new homepage(driver);
		hp.clickAccount();
		logger.info("Clicked on my Account link");
		hp.clickregister();
		logger.info("Clicked on register  link");
		
		Registrationpage regpage=new Registrationpage(driver);
		logger.info("provide custmer detail");
		regpage.setfname(randomeString().toUpperCase());
		regpage.setlname(randomeString().toUpperCase());
		regpage.setemail(randomeString()+"@gmail.com");
		regpage.settelepnoneno(randomeNumber());
		String password=randomeAlphaNumeric();
		regpage.setpassword(password);
		regpage.setCinfirmpassword(password);
		regpage.setprivatepolicy();
		regpage.clickoncontinue();
		logger.info("Validating expected message...");
		 String confmsg=regpage.getConfirmationmsg();
		Assert.assertEquals(confmsg,"Your Account Has Been Created!");
		}
		catch(Exception e) {
		logger.error("Test Failed");
		logger.debug("Debug logs..");
		Assert.fail();
		}
		logger.info("**** Finished  TC001_AccountRegistrationTest ****");

	}
	
	
}
