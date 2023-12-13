package OrangeHRM.Pages_withPF;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import OrangeHRM.Testbase.TestBase1;

public class LoginPage1  {
	
	//Annonation- @FindBy
	/* Syntax:
	@FindBy(locater='locatr_value')
	WebElement nameof_elemnt;
	*/

	@FindBy(xpath="//input[@name=\"username\"]")
	WebElement uname;
	
	@FindBy(css="input[name='password']")
	WebElement pass;
	
	@FindBy(xpath="//button[text()=' Login ']")
	WebElement btnSubmit;
	
	@FindBy(xpath="//div[@class='orangehrm-login-forgot']")
	WebElement forgetpass;
	
	@FindBy(xpath="//img[contains(class,'ohrm_branding')]")
	WebElement logo;
	
	WebDriver driver;
	
	public LoginPage1(WebDriver driver) {
		this.driver = driver;
		PageFactory.initElements(driver, this);
		
	}
	public WebElement username_element()
	{
		return uname;
	}
	public WebElement password_element()
	{
		return pass;
	}
	public WebElement loginbutton_element()
	{
		return btnSubmit;
	}
	public WebElement forgetpasslink_element()
	{
		return forgetpass;
	}
	
	public void Forgetpass()
	{
		forgetpass.click();
	}
	public String page_title()
	{
		return driver.getTitle();
	}
	
	/*
	 * public void login_valid()
	{	// webelementname.operation();
		uname.sendKeys(prop.getProperty("username1"));
		pass.sendKeys(prop.getProperty("password1"));
		btnSubmit.click();
	}
	public void login_invalid()
	{	
		uname.sendKeys(prop.getProperty("username2"));
		pass.sendKeys(prop.getProperty("password2"));
		btnSubmit.click();
	}
	 */
}
