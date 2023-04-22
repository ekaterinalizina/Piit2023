package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class IntroductionToXpaths {
	
	public WebDriver driver;
	public ChromeOptions options;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://rediff.com");
	}
	
	@Test
	public void signOnLink() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
	}

	
	
	@Test
	public void enterLoginCredentials() {
		driver.findElement(By.xpath("//a[@class='signin']")).click();
		driver.findElement(By.xpath("//input[@id ='login1' and @name = 'login']"))
		.sendKeys("seleniumpanda@rediffmail.com");
		driver.findElement(By.xpath("//input[@id ='password' or @name = 'passwd']"))
		.sendKeys("Selenium@123");
		driver.findElement(By.xpath("//input[@name ='proceed' or @class= 'signinbtn']")).click();
	}
	
	
	@AfterMethod
	public void tearDown() {
		driver.quit();
	}
}
