package com.dataproviderExcelSheet_8thApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Parameterize_Rediff {
	//What is parameterization? - using different set of input parameters to 
	
	public WebDriver driver;
	
	@Test
	@Parameters({"Browser", "url", "username", "password"})
	public void loginCredentials(String Browser, String url, String username, String password)  {
		if(Browser.equals("chrome")) {
			driver = new ChromeDriver();
		}else if(Browser.equals("firefox")) {
			driver = new FirefoxDriver();
		}
		

		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	
		driver.findElement(By.cssSelector("input#login1")).sendKeys(username);
		
		driver.findElement(By.cssSelector("input#password")).sendKeys(password);
		
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();;
		
	}
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}

}
