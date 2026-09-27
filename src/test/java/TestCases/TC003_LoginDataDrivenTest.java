package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.MyAccountpage1;
import PageObject.homepage;
import PageObject.loginpage;
import TestBase.BaseClass;
import Utilities.DataProviders;

public class TC003_LoginDataDrivenTest extends BaseClass {
	@Test(dataProvider="LoginData",dataProviderClass=DataProviders.class,groups="Datadriven")
	public void verify_loginDDT(String email,String pass,String exp)
	{
		logger.info("***** starting TC003_LoginDataDrivenTest");
	try
	{
	homepage hp=new homepage(driver);
	hp.clickAccount();
	hp.clicklogin();
	loginpage lp=new loginpage(driver);
	lp.setemail(email);
	lp.setpass(pass);
	lp.clicklogin();
	
	MyAccountpage1 macc=new MyAccountpage1(driver);
	boolean targetpage=macc.isMyAccountPageExists();
	
	/*
	 * Data is valid -login success-test pass-logout
	 *              -login failed-test fail
	
	 */
	if(exp.equalsIgnoreCase("Valid"))
	{
		if(targetpage==true)
		{
			macc.clicklogout1();
			Assert.assertTrue(true);
		}
		else
		{
			Assert.assertTrue(false);
		}
		 /* Data is valid -login success-test fail-logout
		 *                 -login failed-test pass
		
		 */
		if(exp.equalsIgnoreCase("Invalid"))
		{
			if(targetpage==true)
			{
				macc.clicklogout1();
				Assert.assertTrue(false);
			}
			else
			{
				Assert.assertTrue(true);
			}
	}
		
}
	}
	catch(Exception e)
{
	Assert.fail();
}	
	logger.info("***** starting TC003_LoginDataDrivenTest");

}
}
