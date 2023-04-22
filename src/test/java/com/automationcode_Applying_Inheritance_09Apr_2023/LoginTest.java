package com.automationcode_Applying_Inheritance_09Apr_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class LoginTest extends TestBase{
	
	public WebDriver driver;
	
	@BeforeMethod
	public void setUp() {
		TestBase.openBrowserAndApplication();
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		
	}
	
	@Test(priority = 1)
	public void verifyLoginWithValidCredentials() {

		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		softassert.assertTrue(driver.findElement(By.linkText("Logout")).isDisplayed());
		softassert.assertAll();
		
		driver.quit();
	}
	
	@Test(priority = 2)
	public void verifyLoginWithInvalidCredentials() {
		
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda1@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium1@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
		SoftAssert softassert = new SoftAssert();
		String actualWarningMessage = driver.findElement(By.xpath("//div[contains(@class, 'alert-dismissible')]")).getText();
		String expectedWarningMessage = "Warning: No match for E-mail Address and/or Password.";
		softassert.assertTrue(actualWarningMessage.contains(expectedWarningMessage));
		driver.quit();
	}
	
	@AfterMethod
	public void tearDown() {
		
	}
}
