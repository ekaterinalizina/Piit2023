package com_testngcode_18March_2023;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.PageLoadStrategy;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

public class CSS_Selector_Advance {
	public WebDriver driver;
	public ChromeOptions options;
	public Select select;
	public static WebDriverWait wait;
	
	@BeforeMethod
	public void setUp() {
		options = new ChromeOptions();
		options.setPageLoadStrategy(PageLoadStrategy.EAGER);
		options.addArguments("--incognito");
		options.addArguments("--start-maximized");
		options.addArguments("--remote-allow-origins=*");
		driver = new ChromeDriver(options);
		driver.get("https://openweathermap.org/");
		
	}
	
	@Test(priority = 1)
	public void signIn() throws InterruptedException {
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
		Thread.sleep(2000);
	}
	
	@Test(priority = 2)
	public void loginCredentials() throws InterruptedException {
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();;
		Thread.sleep(2000);
	}
	
	@Test(priority = 3)
	public void logOut() throws InterruptedException {
		driver.findElement(By.cssSelector("A.signin\r\n"
				+ "")).click();
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#login1")).sendKeys("seleniumpanda@rediffmail.com");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("input#password")).sendKeys("Selenium@123");
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("Input.signinbtn\r\n"
				+ "")).click();;
		Thread.sleep(2000);
		driver.findElement(By.cssSelector("a.rd_logout"
				+ "")).click();
		Thread.sleep(2000);
	}

	
	
	@AfterMethod
	@Test(priority = 3)
	public void tearDown() {
		driver.quit();
	}
}
