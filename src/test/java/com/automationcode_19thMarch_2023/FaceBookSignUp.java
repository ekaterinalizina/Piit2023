package com.automationcode_19thMarch_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class FaceBookSignUp {
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
		driver.get("https://facebook.com");
	}
	
	@Test(priority = 1)
	public void signUpLink() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		Thread.sleep(7000);
	}

	
	@Test(priority = 2)
	public void enterLoginCredentials() throws InterruptedException {
		driver.findElement(By.xpath("//a[contains(text(), 'Create new account')]")).click();
		Thread.sleep(7000);
		driver.findElement(By.xpath("//input[@name = 'firstname']"))
		.sendKeys("Kate");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'lastname']"))
		.sendKeys("Li");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name = 'reg_email__']"))
		.sendKeys("qa.kateli1987@gmail.com");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name= 'reg_email_confirmation__']"))
		.sendKeys("qa.kateli1987@gmail.com");
		driver.findElement(By.xpath("//input[@name = 'reg_passwd__']"))
		.sendKeys("qa.kateli1987");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@id = 'month']")).click();
		select = new Select(driver.findElement(By.id("month")));
//		select.deselectByIndex(1);
//		select.selectByValue("July"); !!! never use by Index or Value
		
		select.selectByVisibleText("Dec"); // Always select by visible text
		Thread.sleep(2000);
		driver.findElement(By.xpath("//select/option[@value = '12' and text()='Dec']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@id= 'day']")).click();
		
		select= new Select(driver.findElement(By.id("day")));
		select.selectByVisibleText("14");
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select/option[@value= '14']")).click();
		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select[@id = 'year']")).click();
//		Thread.sleep(2000);
//		driver.findElement(By.xpath("//select/option[@value = '1987']")).click();
		select = new Select(driver.findElement(By.id("year")));
		select.selectByVisibleText("1987");
		
		Thread.sleep(2000);
		driver.findElement(By.xpath("//label[text() = 'Female']")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//button[@name= 'websubmit']")).click();
	}
	
	@AfterMethod
	@Test(priority = 3)
	public void tearDown() {
		driver.quit();
	}
	
}
