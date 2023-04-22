package com.testngcode_9Apr_2023Retry_Failed_Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.Assert;
import org.testng.annotations.Test;

public class TNRediffTest {

	public WebDriver driver;
	
	@Test(retryAnalyzer = MyRetry.class)
	public void rediffLogin() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
	
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();
		
		Assert.fail();
	}
	
	public void tn_clickOnLoginPage() {
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://www.tutorialsninja.com/demo/");
		driver.findElement(By.linkText("My Account")).click();
		driver.findElement(By.linkText("Login")).click();
		driver.findElement(By.id("input-email")).sendKeys("seleniumpanda@gmail.com");
		driver.findElement(By.id("input-password")).sendKeys("Selenium@123");
		driver.findElement(By.cssSelector("input.btn.btn-primary")).click();
	}
}
