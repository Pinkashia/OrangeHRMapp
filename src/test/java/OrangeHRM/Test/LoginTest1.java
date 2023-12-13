package OrangeHRM.Test;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.testng.Assert;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.Test;

import OrangeHRM.Pages_withPF.LoginPage1;
import OrangeHRM.Testbase.TestBase1;

public class LoginTest1 extends TestBase1{

	LoginPage1 LP;
	
	String actual_title;
	public LoginTest1() throws IOException {
		super();

	}

	@BeforeSuite
	public void Launch() throws IOException, InterruptedException
	{
		initialization();
		LP= new LoginPage1(driver);
	}

	@Test(enabled=false)
	public void verifyusername_entered()
	{
		String var_username= prop.getProperty("username1"); //TestCase:Verify entered username
		LP.username_element().sendKeys(var_username);
	}

	/*@Test
	public void validate_HomePage_Title() {
		LP.login_valid(); //validate_HomePage_Title
		actual_title= LP.page_title();
		//System.out.println(actual_title);
		Assert.assertEquals(actual_title, "OrangeHRM");// TestNG


	}*/

	@Test
	public void validcredentials1_login() {
		
		//TestCase:Verify login functionality using valid credentials
		LP.username_element().sendKeys(prop.getProperty("username1"));
		LP.password_element().sendKeys(prop.getProperty("password1"));
		LP.loginbutton_element().click();

	}

	@Test
	public void invalidcredentials_login() {

		LP.username_element().sendKeys(prop.getProperty("username2"));
		LP.password_element().sendKeys(prop.getProperty("password2"));
		LP.loginbutton_element().click();

	}
	@Test(enabled=false)
	public void Check_forgotpasslink() {
		
		//TestCase:Verify functionality of forgot password link
		LP.forgetpasslink_element().click();

	}
	
//	@Test
//	public void Validate_CompanyLogo() {
//		
//		//TestCase:Verify functionality of forgot password link
//		LP.forgetpasslink_element().click();
//		
//
//	}
	
	
	@AfterSuite
	public void after() {
		terminate();
	}


}
