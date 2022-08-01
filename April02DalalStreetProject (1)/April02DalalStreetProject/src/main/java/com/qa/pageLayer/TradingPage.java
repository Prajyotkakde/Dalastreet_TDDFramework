package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class TradingPage extends TestBase {
	
	public TradingPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//buy btn1
	@FindBy(xpath="//a[contains(text(),'Buy')]")
	private WebElement buy_btn1;
	
	public void clickOnBuyButton1()
	{
		buy_btn1.click();
	}
	
	//quantity box
	@FindBy(xpath="(//input[@class='form-control'])[3]")
	private WebElement quantity_box;
	
	public void enterQauntityOfShares(String count)
	{
		quantity_box.sendKeys(count);
	}
	
	//buy btn2
	@FindBy(xpath="//button[contains(text(),'Buy')]")
	private WebElement buy_btn2;
	
	public void clickOnBuyButton2()
	{
		buy_btn2.click();
	}
	
	//status 
	@FindBy(xpath="//div[text()='Order Created successfully']")
	private WebElement status;
	
	public String getStatus()
	{
		String data = status.getText();
		return data;
	}

}
