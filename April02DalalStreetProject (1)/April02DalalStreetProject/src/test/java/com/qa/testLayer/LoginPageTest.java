package com.qa.testLayer;
import org.testng.annotations.Test;

import com.qa.pageLayer.LoginPage;
import com.qa.testBase.TestBase;

public class LoginPageTest extends TestBase {
	
	@Test
	public void loginToSite()
	{
//		LoginPage login = new LoginPage();
//		login.enterEmailAddress("amarwaghmare573@gmail.com");
//		login.enterPassword("Test@1234");
//		login.clickOnLogin();
	}
}


/*
 * 			LoginPage login = new LoginPage();
		login.enterMobileNumber("8669971558");
		login.clickOnSubmitButton1();
		login.enterDigitPassword("1234");
		login.clickOnSubmitButton2();
		
		//enter mobile number
	@FindBy(xpath="//input[@id='txt_mobilenumber']")
	private WebElement mobile_number;
	
	public void enterMobileNumber(String number)
	{
		mobile_number.sendKeys(number);
	}
	
	//click on submit btn 
	@FindBy(xpath="//a[@id='lnk_submitmobnumber']")
	private WebElement submit_btn1;
	
	public void clickOnSubmitButton1()
	{
		submit_btn1.click();
	}
	
	//password box 
	@FindBy(xpath="//input[@id='txt_accesspin']")
	private WebElement pass_box;
	
	public void enterDigitPassword(String pin)
	{
		pass_box.sendKeys(pin);
	}
	
	//click on submit btn 
	@FindBy(xpath="//a[@id='lnk_submitaccesspin']")
	private WebElement submit_btn2;
	
	public void clickOnSubmitButton2()
	{
		submit_btn2.click();
	}
}
 */
