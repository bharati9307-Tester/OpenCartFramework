package TestCases;

import org.testng.Assert;
import org.testng.annotations.Test;

import PageObject.MyAccountpage1;
import PageObject.homepage;
import PageObject.loginpage;
import TestBase.BaseClass;

public class TC002_LoginTest  extends BaseClass{
	@Test(groups={"sanity","master"})
	public void verify_login()
	{
		logger.info("***** Starting TC002_LoginTest *****");
		try
		{
			homepage hp=new homepage(driver);
			hp.clickAccount();
			hp.clicklogin();
			loginpage lp=new loginpage(driver);
			lp.setemail(p.getProperty("email"));
			lp.setpass(p.getProperty("password"));
			lp.clicklogin();
			
			MyAccountpage1 macc=new MyAccountpage1(driver);
			boolean targetpage=macc.isMyAccountPageExists();
			Assert.assertTrue(targetpage);
		}
		catch(Exception e)
		{
			Assert.fail();
		}
		logger.info("***** Finished TC002_LoginTest *****");
	}

}
