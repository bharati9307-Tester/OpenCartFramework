package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class homepage extends Basepage{

	public homepage(WebDriver driver) {
		super(driver);
	}
	

	@FindBy(xpath="//span[normalize-space()='My Account']")
	WebElement lnkAccount;
	
	@FindBy(xpath="//ul[@class='dropdown-menu dropdown-menu-right']//a[normalize-space()='Register']")
	WebElement lnkregister;
	
	@FindBy(linkText="Login") WebElement linklogin;	
	
	public void clickAccount()
	{
		lnkAccount.click();
	}
	public void clickregister()
	{
		lnkregister.click();
	}
	public void clicklogin()
	{
		linklogin.click();
	}

}
