package com.qa.testLayer;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.qa.testBase.TestBase;

public class TestCase1 extends TestBase {
	
	@Test
	public void buyShare1() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.enterCompanyName("AXIS");
		Thread.sleep(2000);
		dash.selectOptionAxis();
		//--------------------------
		Thread.sleep(2000);
		trade.clickOnBuyButton1();
		trade.enterQauntityOfShares("5");
		trade.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(trade.getStatus());
		Assert.assertEquals(trade.getStatus(), "Order Created successfully");
	}
	
	@Test
	public void buyShare2() throws InterruptedException
	{
		Thread.sleep(3000);
		dash.enterCompanyName("WIPRO");
		Thread.sleep(2000);
		dash.selectOptionWipro();
		//--------------------------
		Thread.sleep(2000);
		trade.clickOnBuyButton1();
		trade.enterQauntityOfShares("5");
		trade.clickOnBuyButton2();
		Thread.sleep(2000);
		System.out.println(trade.getStatus());
		Assert.assertEquals(trade.getStatus(), "Order Created successfully");
	}

}
