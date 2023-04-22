package com_testng_25March_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class AdvancedXpathRedif {

	public WebDriver driver;
	public ChromeOptions options;
	public Select select;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("http://www.tutorialsninja.com/demo/");
	}
	
	@Test(priority = 1)
	public void clickMyAccount() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'fa fa-user']/following::span[text() = 'My Account']\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}

	
	
	
	@Test(priority = 2)
	public void clickLogin() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'fa fa-user']/following::span[text() = 'My Account']\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class ='dropdown-menu dropdown-menu-right']/descendant::a[2]\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//aside[@id ='column-right']/preceding::input[@class = 'btn btn-primary']")).click();
		
	}
	
	@Test(priority = 3)
	public void clickLogout() throws InterruptedException {
		driver.findElement(By.xpath("//i[@class = 'fa fa-user']/following::span[text() = 'My Account']\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//ul[@class ='dropdown-menu dropdown-menu-right']/descendant::a[2]\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@id='input-email']")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.xpath("//input[@id='input-password']")).sendKeys("Selenium@123");
		driver.findElement(By.xpath("//aside[@id ='column-right']/preceding::input[@class = 'btn btn-primary']")).click();
		driver.findElement(By.xpath("//aside[@id ='column-right']/descendant::a[text() ='Logout']")).click();
		
	}
	
	
	@AfterMethod
	@Test(priority = 3)
	public void tearDown() {
		driver.quit();
	}
}
