package com.dataproviderExcelSheet_8thApril_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

public class Para_TN {
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
	

		driver.manage().window().maximize();
		driver.get(url);
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
		
}
}
