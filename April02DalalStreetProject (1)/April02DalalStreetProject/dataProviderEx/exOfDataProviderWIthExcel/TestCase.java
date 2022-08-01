package exOfDataProviderWIthExcel;

import java.io.IOException;

import org.openqa.selenium.By;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestCase extends TestBase {
	
	@Test
	public void verifyLogin(String firstname,String password) throws IOException
	{
		ReadData read = new ReadData();
		driver.findElement(By.xpath("//input[@id='user-name']")).sendKeys(read.readDataFromExcel("Sheet1", 1, 0));
		driver.findElement(By.xpath("//input[@id='password']")).sendKeys(read.readDataFromExcel("Sheet1", 1, 1));
		driver.findElement(By.xpath("//input[@id='login-button']")).click();
	}
	
	//(dataProvider="loginData")
	@DataProvider(name="loginData")
	public String[][] getData() throws IOException
	{
		ReadData read = new ReadData();
		int r = read.getRowCount("Sheet1");
		int c = read.getCellCount("Sheet1", 1);
		
		String loginData[][] =  new String[r][c];
		
		for(int i=1;i<=r;i++)
		{
			for(int j=0;j<c;j++)
			{
				loginData[i-1][j] = read.readDataFromExcel("Sheet1", i, j);
			}
		}
		
		return loginData;
	}

}
