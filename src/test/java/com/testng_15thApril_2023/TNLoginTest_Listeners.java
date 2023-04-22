package com.testng_15thApril_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationcode_Applying_Inheritance_09Apr_2023.TestBase;

public class TNLoginTest_Listeners {

	public static WebDriver driver;
	public static void openBrowserAndApplication() {//constructor of Parent class
		
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.manage().timeouts().pageLoadTimeout(Duration.ofSeconds(10));
		driver.manage().timeouts().scriptTimeout(Duration.ofSeconds(100));
		driver.get("http://www.tutorialsninja.com/demo/");
	}

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
}
