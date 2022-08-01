package com.qa.pageLayer;


import org.openqa.selenium.WebElement;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashboardPage extends TestBase {
	
	public DashboardPage()
	{
		PageFactory.initElements(driver, this);
	}
	
	//search box
	@FindBy(xpath="//input[@class='form-control']")
	private WebElement search_box;
	
	public void enterCompanyName(String com_name)
	{
		search_box.sendKeys(com_name);
	}
	
	//select option 
	@FindBy(partialLinkText="AXIS")
	private WebElement axis_option;
	
	public void selectOptionAxis()
	{
		 Actions act = new Actions(driver);
		 act.moveToElement(axis_option).click().build().perform();
	}
	
	//select option 
	@FindBy(partialLinkText="WIPRO")
	private WebElement wipro_option;
	
	public void selectOptionWipro()
	{
		 Actions act = new Actions(driver);
		 act.moveToElement(wipro_option).click().build().perform();
	}
}
