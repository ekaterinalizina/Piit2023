package com.automationcode_Applying_Inheritance_09Apr_2023;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

public class SearchProductTest extends TestBase{

	
public WebDriver driver;
public SoftAssert softassert = new SoftAssert();
	
	@BeforeMethod
	public void setUp() {
		driver = new ChromeDriver();
		TestBase.openBrowserAndApplication();
		
	}
	
	@Test
	public void searchValidProduct() {
		driver.findElement(By.name("search")).sendKeys("HP");
		driver.findElement(By.cssSelector("button.btn.btn-default.btn-lg"));

		softassert.assertTrue(driver.findElement(By.linkText("HP LP3065")).isDisplayed());
	}
}
