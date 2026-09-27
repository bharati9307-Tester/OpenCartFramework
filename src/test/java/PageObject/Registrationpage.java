package PageObject;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registrationpage  extends Basepage{

	public Registrationpage(WebDriver driver)
	{
		super(driver);
		
	}



@FindBy(xpath="//input[@id='input-firstname']")
WebElement fname;
@FindBy(xpath="//input[@id='input-lastname']") WebElement lname;
@FindBy(xpath="//input[@id='input-email']") WebElement mail;
@FindBy(xpath="//input[@id='input-telephone']") WebElement telno;
@FindBy(xpath="//input[@id='input-password']") WebElement passwor;
@FindBy(xpath="//input[@id='input-confirm']") WebElement confirmpass;
@FindBy(xpath="//input[@name='agree']") WebElement chkagree;
@FindBy(xpath="//input[@value='Continue']") WebElement btncontinue;
@FindBy(xpath="//h1[normalize-space()='Your Account Has Been Created!']") WebElement  msgconfirmation;

public void setfname(String firstname)
{
	fname.sendKeys(firstname);
}
public void setlname(String lastname)
{
	lname.sendKeys(lastname);
}
public void settelepnoneno(String no)
{
	telno.sendKeys(no);
}
public void setpassword(String pass)
{
	passwor.sendKeys(pass);
}
public void setCinfirmpassword(String pass)
{
	confirmpass.sendKeys(pass);
}
public void setprivatepolicy()
{
	chkagree.click();
}
public void clickoncontinue()
{
	btncontinue.click();
}
public String getConfirmationmsg()
{
	try {
		return(msgconfirmation.getText());
	}
	catch(Exception e) {
		return(e.getMessage());
	}
}
public void setemail(String email) {
	mail.sendKeys(email);	
	
}



	

}
